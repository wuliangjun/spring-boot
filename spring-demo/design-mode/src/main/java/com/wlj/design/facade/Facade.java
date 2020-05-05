package com.wlj.design.facade;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 16:46
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class Facade {

    //被委托的对象
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();

    public void methodA(){
        classA.doSomethingA();
    }

    public void methodB(){
        classB.doSomethingB();
    }

}
