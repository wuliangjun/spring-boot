package com.wlj.design.command;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/2 17:25
 * @history: 1.2020/5/2 created by liangjun.wu
 */
public abstract class Command {

    protected final Receiver receiver;

    protected Command(Receiver receiver) {
        this.receiver = receiver;
    }

    //执行命令的方法
    public abstract void execute();
}
