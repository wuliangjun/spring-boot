package com.wlj.design.single;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description: 有个数限制的单例模式（参考《设计模式之禅》）
 * @author: liangjun.wu
 * @since: 2020/3/6 9:16
 * @history: 1.2020/3/6 created by liangjun.wu
 */
public class SingletonExt {
    //定义最多产生的实例数量
    private static final int maxNum = 2;

    private static ArrayList<SingletonExt> singletonExtList = new ArrayList<SingletonExt>();

    //当前实例的序号
    private static int cntNumOfInstance = 0;

    static {
        for(int i = 0 ; i < maxNum ; i++){
            singletonExtList.add(new SingletonExt());
        }
    }

    private SingletonExt(){}

    //随机获取一个实例
    public static SingletonExt getInstance(){
        Random random = new Random();
        cntNumOfInstance = random.nextInt(maxNum);
        return singletonExtList.get(cntNumOfInstance);
    }
}
