package com.wlj.design.factory.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/3/11 15:40
 * @history: 1.2020/3/11 created by liangjun.wu
 */
public class BlackHuman implements Human{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void getColor() {
        logger.info("我的皮肤是黑色的");
    }

    public void talk() {
        logger.info("黑色人种的人说话");
    }
}
