package com.libo.mytext.compnotent;

import com.libo.mytext.module.CommonModule;
import com.libo.mytext.scope.ActivityScope;
import com.libo.mytext.view.LoginActivity;

import dagger.Component;

/**
 * Component就是注入者与被注入者之间联系的桥梁，
 * 有了它dagger2才知道要把谁注入到什么地方，所以它是非常重要且不可缺少的
 */
@ActivityScope
@Component(modules = CommonModule.class)////编写接口 并使用modules=的方法链接上第一步中编写的Module类；
public interface CommonComponent { //编写接口
    // activity 参数表示要将依赖注入到的目标位置
    void Inject(LoginActivity activity);
}
