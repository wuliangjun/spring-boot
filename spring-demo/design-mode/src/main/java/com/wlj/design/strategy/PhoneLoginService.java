package com.wlj.design.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 12:15
 * @history: 1.2020/4/25 created by liangjun.wu
 */
@Component("phone")
public class PhoneLoginService implements LoginStrategy{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public boolean before() {
        logger.info("登录前校验登录人员的信息");
        return false;
    }

    public boolean login() {
        logger.info("登录");
        return false;
    }

    public boolean after() {
        logger.info("登录后校验");
        return false;
    }
}
