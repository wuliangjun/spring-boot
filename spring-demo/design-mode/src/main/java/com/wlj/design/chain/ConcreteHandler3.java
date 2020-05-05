package com.wlj.design.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/5 15:19
 * @history: 1.2020/5/5 created by liangjun.wu
 */
public class ConcreteHandler3 extends Handler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected Level getHandlerLevel() {
        logger.info("ConcreteHandler3 getHandlerLevel");
        return new Level("3");
    }

    @Override
    protected Response doSomething(Request request) {
        logger.info("ConcreteHandler3 doSomething");
        return null;
    }
}
