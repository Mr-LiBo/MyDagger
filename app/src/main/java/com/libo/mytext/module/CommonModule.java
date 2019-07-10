package com.libo.mytext.module;

import com.libo.mytext.model.ICommonView;
import com.libo.mytext.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module//模块 标注这个类
public class CommonModule {
    private ICommonView view;

    public CommonModule(ICommonView view) {
        this.view = view;
    }

    @Provides //提供  编写方法返回值为我们需要inject的类型并使用@Provides标注这个方法；
    @ActivityScope  //自定义的注解
    public ICommonView provideIcommonView() {
        return this.view;
    }

}
