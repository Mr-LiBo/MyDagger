package com.libo.mytext.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.libo.mytext.R;
import com.libo.mytext.compnotent.DaggerCommonComponent;
import com.libo.mytext.model.ICommonView;
import com.libo.mytext.model.User;
import com.libo.mytext.module.CommonModule;
import com.libo.mytext.presenter.LoginPresenter;

import javax.inject.Inject;


public class LoginActivity extends AppCompatActivity implements ICommonView {
    @Inject
    LoginPresenter presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = findViewById(R.id.bt_login);
        DaggerCommonComponent.
                builder().
                commonModule(new CommonModule(this)).
                build().
                Inject(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login(new User());
            }
        });
    }

    @Override
    public Context getContext() {
        return this;
    }
}
