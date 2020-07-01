package com.wlj.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/6/10 23:13
 * @history: 1.2020/6/10 created by liangjun.wu
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue(){
        return new Queue("hello");
    }

}
