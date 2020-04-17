package com.wlj.design.proxy;

import com.wlj.design.proxy.impl.BeforeAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/16 21:06
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
        boolean isJoinPoint = true;
        if(isJoinPoint){
            (new BeforeAdvice()).exec();
        }
        return (T)Proxy.newProxyInstance(loader, interfaces, h);
    }
}
