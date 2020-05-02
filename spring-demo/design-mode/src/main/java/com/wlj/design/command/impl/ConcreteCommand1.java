package com.wlj.design.command.impl;

import com.wlj.design.command.Command;
import com.wlj.design.command.Receiver;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/2 17:32
 * @history: 1.2020/5/2 created by liangjun.wu
 */
public class ConcreteCommand1 extends Command{

    //设置新的接收者的构造方法
    public ConcreteCommand1(Receiver receiver) {
        super(receiver);
    }

    //默认使用ConcreteReceiver1作为接收者
    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
