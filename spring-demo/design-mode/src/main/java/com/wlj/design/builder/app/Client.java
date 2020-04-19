package com.wlj.design.builder.app;

import com.wlj.design.builder.director.Director;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 22:46
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args){
        Director director = new Director();
        //生产一辆A类型奔驰车
        director.getABenzModel().run();
        //生产一辆B类型奔驰车
        director.getBBenzModel().run();
    }
}
