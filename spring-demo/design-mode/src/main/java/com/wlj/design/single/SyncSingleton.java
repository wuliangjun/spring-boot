package com.wlj.design.single;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description: 需要增加synchronized关键字的单例模式（懒汉模式）
 * @author: liangjun.wu
 * @since: 2020/3/6 9:07
 * @history: 1.2020/3/6 created by liangjun.wu
 */
public class SyncSingleton {
    private static SyncSingleton syncSingleton = null;

    private SyncSingleton(){

    }

    public static SyncSingleton getInstance(){

        synchronized (syncSingleton){
            if(syncSingleton == null){
                syncSingleton = new SyncSingleton();
            }
        }
        return syncSingleton;
    }
}
