package com.wlj.design.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 12:25
 * @history: 1.2020/4/25 created by liangjun.wu
 */
@Component("account")
public class AccountLoginService implements LoginStrategy{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public boolean before() {
        logger.info("账号是否黑名单校验");
        return false;
    }

    public boolean login() {
        logger.info("账户登录");
        return false;
    }

    public boolean after() {
        logger.info("登陆后获取账户信息");
        return false;
    }
}
