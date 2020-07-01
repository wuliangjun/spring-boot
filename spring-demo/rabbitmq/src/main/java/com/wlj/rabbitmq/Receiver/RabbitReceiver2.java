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
 * @since: 2020/6/11 0:11
 * @history: 1.2020/6/11 created by liangjun.wu
 */
@Component
@RabbitListener(queues = "hello")
public class RabbitReceiver2 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void receive(String msg){
        logger.info("receive2 msg is "+msg);
    }
}
