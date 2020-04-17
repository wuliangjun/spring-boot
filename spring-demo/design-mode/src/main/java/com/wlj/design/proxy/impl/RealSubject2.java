package com.wlj.design.proxy.impl;

import com.wlj.design.proxy.Subject2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/16 22:29
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class RealSubject2 implements Subject2{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void doSomeThing2(String string) {
        logger.info("执行了业务操作2----->"+string);

    }
}
