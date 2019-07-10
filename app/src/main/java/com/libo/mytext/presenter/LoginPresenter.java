package com.libo.mytext.presenter;

import android.content.Context;
import android.widget.Toast;

import com.libo.mytext.model.ICommonView;
import com.libo.mytext.model.User;

import javax.inject.Inject;

public class LoginPresenter {
    ICommonView iCommonView;


    @Inject//注入
    public LoginPresenter(ICommonView iCommonView) {
        this.iCommonView = iCommonView;
    }

    public void login(User user){
        Context context = iCommonView.getContext();
        Toast.makeText( context,"login.....",Toast.LENGTH_SHORT).show();;
    }
}
