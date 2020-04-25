package com.wlj.design.mediator;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 16:32
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public class ConcreteMediator extends Mediator{
    @Override
    public void doSomeThing1() {
        //调用同事类的方法，或其他业务逻辑
        super.concreteColleague1.selfMethod1();
        super.concreteColleague2.selfMethod2();
    }

    @Override
    public void doSomeThing2() {
        super.concreteColleague1.selfMethod1();
        super.concreteColleague2.selfMethod2();
    }
}
