package com.wlj.design.command;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/2 17:26
 * @history: 1.2020/5/2 created by liangjun.wu
 */
public abstract class Receiver {

    //抽象接收者、定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
