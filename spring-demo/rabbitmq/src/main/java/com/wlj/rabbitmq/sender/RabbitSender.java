package com.wlj.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/6/10 23:26
 * @history: 1.2020/6/10 created by liangjun.wu
 */
@Component
public class RabbitSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(String msg){
        this.amqpTemplate.convertAndSend("hello",msg);
    }
}
