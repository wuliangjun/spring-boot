package com.wlj.design.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 15:08
 * @history: 1.2020/4/25 created by liangjun.wu
 */
@Service
public class SpringSimpleContext {

    @Autowired
    private final Map<String, LoginStrategy> strategyMap = new ConcurrentHashMap<>();

    public String login(String poolId){
        LoginStrategy loginStrategy = strategyMap.get(poolId);
        if(loginStrategy != null){
            loginStrategy.before();
            loginStrategy.login();
            loginStrategy.after();
        }
        return "";
    }
}
