package com.wlj.design.template.app;

import com.wlj.design.template.AbstractClass;
import com.wlj.design.template.ConcreteClass1;
import com.wlj.design.template.ConcreteClass2;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 17:37
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class Client {
    public static void main(String[] args){
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();
        abstractClass1.templateMethod();
        abstractClass2.templateMethod();
    }
}
