package com.wlj.redis.controller;

import com.wlj.redis.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/3/22 17:18
 * @history: 1.2020/3/22 created by liangjun.wu
 */
@RestController
@RequestMapping("/test")
public class RedisController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/testRedis")
    public void testRedis() {
        Long expire = redisTemplate.getExpire("wlj");
        redisTemplate.opsForValue().set("wlj", "吴良军");
        User user1 = new User();
        user1.setUserId("1");
        user1.setUserName("wlj1");
        User user2 = new User();
        user2.setUserId("2");
        user2.setUserName("wlj2");
        redisTemplate.opsForHash().put("wljh", "wlj1", user1);
        redisTemplate.opsForHash().put("wljh", "wlj2", user2);
        User user = (User)redisTemplate.opsForHash().get("wljh", "wlj2");
        logger.info("expire is " + expire);
    }

}
