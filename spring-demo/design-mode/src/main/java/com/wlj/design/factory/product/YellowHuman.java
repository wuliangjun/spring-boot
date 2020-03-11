package com.wlj.design.factory.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/3/11 15:53
 * @history: 1.2020/3/11 created by liangjun.wu
 */
public class YellowHuman implements Human{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void getColor() {
        logger.info("我的皮肤是黄色的");
    }

    public void talk() {
        logger.info("黄色人种的人说话");
    }
}
