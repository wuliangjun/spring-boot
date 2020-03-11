package com.wlj.design.single;

/**
 * @Copyright: liangjun.wu.All rights reserved.
 * @Description: 通用单例模式（饿汉模式）
 * @author: liangjun.wu
 * @since: 2020/3/6 8:59
 * @history: 1.2020/3/6 created by liangjun.wu
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return  singleton;
    }
}
