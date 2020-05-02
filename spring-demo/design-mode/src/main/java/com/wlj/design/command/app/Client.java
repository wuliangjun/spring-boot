package com.wlj.design.command.app;

import com.wlj.design.command.Command;
import com.wlj.design.command.Invoker;
import com.wlj.design.command.impl.ConcreteCommand1;
import com.wlj.design.command.impl.ConcreteCommand2;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/2 17:37
 * @history: 1.2020/5/2 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Command command1 = new ConcreteCommand1();
        invoker.setCommand(command1);
        invoker.action();
        Command command2 = new ConcreteCommand2();
        invoker.setCommand(command2);
        invoker.action();
    }
}
