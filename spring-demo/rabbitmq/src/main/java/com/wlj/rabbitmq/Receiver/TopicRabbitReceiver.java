package com.wlj.rabbitmq.Receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/6/11 0:31
 * @history: 1.2020/6/11 created by liangjun.wu
 */
@RabbitListener(queues = "topic-msg")
@Component
public class TopicRabbitReceiver {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void receive(String msg){
        logger.info("TopicReceive1 get msg is "+msg);
    }
}
