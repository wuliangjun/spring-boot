package com.wlj.mybatis.service;

import com.wlj.mybatis.dto.User;

import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/2/17 14:24
 * @history: 1.2020/2/17 created by liangjun.wu
 */
public interface UserService {

    /**
     *  使用mybatis中BaseMapper
     * @return
     */
    List getAllUser();

    /**
     *  获取用户
     * @param name
     * @return
     */
    User getUserByName(String name);

    /**
     *  根据用户名获取用户列表
     * @param nameList
     * @return
     */
    List getUserByNames(List nameList);
}
