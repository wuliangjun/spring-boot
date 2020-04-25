package com.wlj.design.mediator.app;

import com.wlj.design.mediator.ConcreteColleague1;
import com.wlj.design.mediator.ConcreteColleague2;
import com.wlj.design.mediator.ConcreteMediator;
import com.wlj.design.mediator.Mediator;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 16:36
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();
        //同事类1处理自己的业务
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        concreteColleague1.selfMethod1();
        //同事类1委托中介者处理业务
        concreteColleague1.depMethod1();

        //同事类2处理自己的业务
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);
        concreteColleague2.selfMethod2();
        //同事类1委托中介者处理业务
        concreteColleague2.depMethod12();
    }
}
