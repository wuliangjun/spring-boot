package com.wlj.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wlj.mybatis.dto.User;

import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/2/17 14:16
 * @history: 1.2020/2/17 created by liangjun.wu
 */
public interface UserMapper extends BaseMapper<User>{

    /**
     *  mapper学习：select
     */
    User selectUserByName(String name);

    /**
     *  mapper：动态sql
     */
    List<User> selectUserByNames(List list);

    Integer updateUserById(String id);
}
