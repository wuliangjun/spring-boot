package com.wlj.design.strategy;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 12:18
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public class SimpleContext {

    private LoginStrategy loginStrategy;

    public SimpleContext(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public boolean login(){
        loginStrategy.before();
        loginStrategy.login();
        loginStrategy.after();
        return true;
    }
}
