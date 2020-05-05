package com.wlj.design.flyweight;

import java.util.HashMap;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 14:09
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class FlyweightFactory {

    //定义一个池容器
    private static HashMap<String,Flyweight> pool = new HashMap<>();

    //享元工厂
    public static Flyweight getFlyweight(String extrinsic){
        //需要返回的对象
        Flyweight flyweight = null;
        //在池中没有该对象
        if(pool.containsKey(extrinsic)){
            flyweight = pool.get(extrinsic);
        }else {
            flyweight = new ConcreteFlyweight1(extrinsic);
            pool.put(extrinsic,flyweight);
        }
        return flyweight;
    }

}
