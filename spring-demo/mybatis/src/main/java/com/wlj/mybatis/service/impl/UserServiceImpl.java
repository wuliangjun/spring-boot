package com.wlj.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wlj.mybatis.dto.User;
import com.wlj.mybatis.mapper.UserMapper;
import com.wlj.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/2/17 14:25
 * @history: 1.2020/2/17 created by liangjun.wu
 */

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Value("${cux.mp.start}")
    private boolean cuxFlag;

    public List getAllUser() {
        return userMapper.selectList(null);
    }

    public User getUserByName(String name) {
        if(cuxFlag){
            return userMapper.selectUserByName(name);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("name",name);
        return userMapper.selectOne(queryWrapper);
    }

    public List getUserByNames(List nameList){
        if(cuxFlag){
            return userMapper.selectUserByNames(nameList);
        }
        return null;
    }
}
