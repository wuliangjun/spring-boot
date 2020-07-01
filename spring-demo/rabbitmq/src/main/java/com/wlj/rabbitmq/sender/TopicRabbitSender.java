package com.wlj.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/6/11 0:35
 * @history: 1.2020/6/11 created by liangjun.wu
 */
@Component
public class TopicRabbitSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send1(){
        amqpTemplate.convertAndSend("my-topic-exchange","topic.msg","这个是routing key为topic.msg的消息");
    }

    public void send2(){
        UUID uuid = UUID.randomUUID();
        amqpTemplate.convertAndSend("my-topic-exchange","topic."+uuid.toString(),"这个是routing key(topic.#)的消息，实际routing key为："+"topic."+uuid.toString());
    }
}
