package com.wlj.design.command.impl;

import com.wlj.design.command.Receiver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/5/2 17:29
 * @history: 1.2020/5/2 created by liangjun.wu
 */
public class ConcreteReceiver2 extends Receiver {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void doSomething() {
        logger.info("接收者2，执行业务2");
    }
}
