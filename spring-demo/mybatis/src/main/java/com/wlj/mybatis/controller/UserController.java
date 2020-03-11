package com.wlj.mybatis.controller;

import com.wlj.mybatis.comm.DataResponse;
import com.wlj.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/2/17 16:03
 * @history: 1.2020/2/17 created by liangjun.wu
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getAllUser",method = RequestMethod.GET)
    public DataResponse getAllUser(){
        List userList = userService.getAllUser();
        return DataResponse.ok().data(userList);
    }

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public DataResponse getUserByName(@RequestParam String name){
        return DataResponse.ok().data(userService.getUserByName(name));
    }

    @RequestMapping(value = "getUserByNames",method = RequestMethod.GET)
    public DataResponse getUserByNames(@RequestParam String name){
        List list = new ArrayList();
        list.add("吴良军");
        list.add("mlgj");
        return DataResponse.ok().data(userService.getUserByNames(list));
    }
}
