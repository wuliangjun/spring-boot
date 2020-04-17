package com.wlj.design.proxy.impl;

import com.wlj.design.proxy.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description: 具体主题、被代理角色
 * @author: liangjun.wu
 * @since: 2020/4/16 16:54
 * @history: 1.2020/4/16 created by liangjun.wu
 */
public class RealSubject implements Subject{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void doSomeThing(String string) {
        logger.info("执行了业务操作----->"+string);
    }
}
