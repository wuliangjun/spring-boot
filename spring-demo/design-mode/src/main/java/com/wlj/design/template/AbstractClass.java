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
        operation1();
        //2.烧水
        operation2();
    }

}