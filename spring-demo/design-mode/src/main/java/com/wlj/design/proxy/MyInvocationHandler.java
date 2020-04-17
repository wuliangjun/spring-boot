package com.wlj.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/16 21:01
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class MyInvocationHandler implements InvocationHandler{

    //被代理的对象
    private Object target = null;

    public MyInvocationHandler(Object _obj){
        this.target = _obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
