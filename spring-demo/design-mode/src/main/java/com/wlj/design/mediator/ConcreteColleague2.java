package com.wlj.design.mediator;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 16:28
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //自有方法
    public void selfMethod2(){
        //处理自己的业务逻辑
    }
    //依赖方法
    public void depMethod12(){
        //自己无法处理的业务逻辑，委托给中介者处理
        super.mediator.doSomeThing2();
    }

}
