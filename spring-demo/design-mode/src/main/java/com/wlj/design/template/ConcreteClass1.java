package com.wlj.design.template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author 吴良军
 */
public class ConcreteClass1 extends AbstractClass {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private boolean hook1 = true;
    private boolean hook2 = true;
    /**
     * Default constructor
     */
    public ConcreteClass1() {
        logger.info("模板1：烧火烧水");
    }

    /**
     * 
     */
    protected void operation1(){
        logger.info("倒入农夫山泉");
    }

    /**
     * 
     */
    protected void operation2(){
        logger.info("烧火烧水");
    }

    //钩子方法
    protected boolean hook1(){
        return this.hook1;
    }

    //钩子方法
    protected boolean hook2(){
        return this.hook2;
    }

    public boolean isHook1() {
        return hook1;
    }

    public void setHook1(boolean hook1) {
        this.hook1 = hook1;
    }

    public boolean isHook2() {
        return hook2;
    }

    public void setHook2(boolean hook2) {
        this.hook2 = hook2;
    }
}