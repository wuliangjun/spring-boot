package com.wlj.design.abstractfactory.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 16:23
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public abstract class AbstractBlackHuman implements Human{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void getColor() {
        logger.info("我的皮肤是黑色的");
    }

    public void talk() {
        logger.info("黑色人种的人说话");
    }
}
