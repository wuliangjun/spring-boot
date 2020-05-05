package com.wlj.design.facade.app;

import com.wlj.design.facade.Facade;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 16:46
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args){
        //高层模块，无需与具体的子系统交互
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
