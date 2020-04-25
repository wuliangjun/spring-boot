package com.wlj.design.strategy.app;

import com.wlj.design.strategy.SpringSimpleContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/4/25 15:03
 * @history: 1.2020/4/25 created by liangjun.wu
 */
@RestController
@RequestMapping(value = "/api/test/strategy")
public class TestController {

    @Autowired
    private SpringSimpleContext springSimpleContext;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestParam String arg1){
        return springSimpleContext.login(arg1);
    }
}
