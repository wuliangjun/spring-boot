package com.wlj.design.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/17 17:10
 * @history: 1.2020/4/17 created by liangjun.wu
 */
public class ConcreteDecorator1 extends Decorator{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void decorateBat(){
        logger.info("我加了一个避震器");
    }

    @Override
    public void playBall() {
        decorateBat();
        super.playBall();
    }
}
