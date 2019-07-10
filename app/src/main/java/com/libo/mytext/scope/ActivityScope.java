package com.libo.mytext.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 定义一个注解ActivityScope
 * 作用是限定被它标记的对象生命周期与对应的Activity相同（笑）。其实注解里我们使用了2个元注解
 */
@Scope  //标记局部单例
@Retention(RetentionPolicy.RUNTIME)  //指定了它是运行时注解,就是说注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
public @interface ActivityScope {
}
