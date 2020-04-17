package com.wlj.design.proxy.impl;

import com.wlj.design.proxy.IAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/16 21:12
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class BeforeAdvice implements IAdvice{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    public void exec() {
        logger.info("前置通知被执行");
    }
}
