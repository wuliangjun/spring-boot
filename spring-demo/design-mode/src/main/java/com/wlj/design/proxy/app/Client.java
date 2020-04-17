package com.wlj.design.proxy.app;

import com.wlj.design.proxy.*;
import com.wlj.design.proxy.impl.GamePlayer;
import com.wlj.design.proxy.impl.RealSubject;
import com.wlj.design.proxy.impl.RealSubject2;

import java.lang.reflect.InvocationHandler;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/16 21:13
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args){
        //动态代理
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        proxy.doSomeThing("代理1完成");

        //定义第二个主题
        Subject2 subject2 = new RealSubject2();
        handler = new MyInvocationHandler(subject2);
        Subject2 proxy2 = DynamicProxy.newProxyInstance(subject2.getClass().getClassLoader(),subject2.getClass().getInterfaces(),handler);
        proxy2.doSomeThing2("代理2完成");

        //静态代理
        IGamePlayer gamePlayer = new GamePlayer("wlj");
        IGamePlayer proxy3 = new StaticGamePlayerProxy(gamePlayer);
        proxy3.playBoss();
        proxy3.playGame();
    }
}
