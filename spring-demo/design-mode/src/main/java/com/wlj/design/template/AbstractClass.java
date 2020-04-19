package com.wlj.design.template;

import java.util.*;

/**
 * @author 吴良军
 */
public abstract class AbstractClass {

    /**
     * Default constructor
     */
    public AbstractClass() {
    }

    /**
     * 
     */
    protected abstract void operation1();

    /**
     * 
     */
    protected abstract void operation2();

    /**
     * 
     */
    public final void templateMethod() {
        // TODO implement here
        //烧开水的两个步骤
        //1.装水到热水壶
        //若水壶中已经有水了，就不需要再倒水了
        if(hook1()){
            operation1();
        }
        //2.烧水
        if(hook2()){
            operation2();
        }
    }

    //钩子方法
    protected boolean hook1(){
        return true;
    }

    //钩子方法
    protected boolean hook2(){
        return true;
    }

}