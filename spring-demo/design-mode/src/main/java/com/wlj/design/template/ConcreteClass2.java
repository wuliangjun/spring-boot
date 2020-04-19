package com.wlj.design.template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @author 吴良军
 */
public class ConcreteClass2 extends AbstractClass {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * Default constructor
     */
    public ConcreteClass2() {
        logger.info("模板2：热水壶烧水");
    }

    /**
     *
     */
    protected void operation1(){
        logger.info("倒入自来水");
    }

    /**
     *
     */
    protected void operation2(){
        logger.info("将热水壶通电，烧水");
    }
}