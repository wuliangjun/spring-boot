package com.wlj.design.strategy.app;

import com.wlj.design.strategy.AccountLoginService;
import com.wlj.design.strategy.PhoneLoginService;
import com.wlj.design.strategy.SimpleContext;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 12:21
 * @history: 1.2020/4/25 created by liangjun.wu
 */
public class Client {

    public static void main(String[] args){
        SimpleContext simpleContext = new SimpleContext(new PhoneLoginService());
        simpleContext.login();

        simpleContext = new SimpleContext(new AccountLoginService());
        simpleContext.login();
    }
}
