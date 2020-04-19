package com.wlj.design.builder.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 22:59
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class BMWModel extends CarModel{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String name = "宝马车";

    protected void start() {
        logger.info(name+"启动");
    }

    protected void stop() {
        logger.info(name+"熄火");
    }

    protected void alarm() {
        logger.info(name+"鸣笛");
    }

    protected void engineBoom() {
        logger.info(name+"发动引擎");
    }
}
