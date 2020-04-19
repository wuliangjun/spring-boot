package com.wlj.design.template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author 吴良军
 */
public class ConcreteClass1 extends AbstractClass {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
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

}