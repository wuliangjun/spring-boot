package com.wlj.design.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/17 17:04
 * @history: 1.2020/4/17 created by liangjun.wu
 */
public class ConcreteComponent implements Component{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void playBall() {
        logger.info("我正在打网球");
    }
}
