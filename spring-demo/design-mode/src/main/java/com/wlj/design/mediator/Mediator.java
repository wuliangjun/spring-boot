package com.wlj.design.mediator;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 16:26
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public abstract class Mediator {
    //定义同事类
    protected ConcreteColleague1 concreteColleague1;
    protected ConcreteColleague2 concreteColleague2;

    //中介者运行只有部分同事类，因此用get/set方法注入同事类

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    //中介者模式的业务逻辑
    public abstract void doSomeThing1();
    public abstract void doSomeThing2();
}
