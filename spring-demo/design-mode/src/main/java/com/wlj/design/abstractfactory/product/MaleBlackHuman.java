package com.wlj.design.abstractfactory.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/19 16:30
 * @history: 1.2020/4/19 created by liangjun.wu
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void getSex() {
        logger.info("黑人男性");
    }
}
