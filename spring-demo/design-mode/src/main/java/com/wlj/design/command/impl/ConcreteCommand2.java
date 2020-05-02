package com.wlj.design.command.impl;

import com.wlj.design.command.Command;
import com.wlj.design.command.Receiver;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/2 17:36
 * @history: 1.2020/5/2 created by liangjun.wu
 */
public class ConcreteCommand2 extends Command {

    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    public ConcreteCommand2(){
        super(new ConcreteReceiver2());
    }


    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
