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
 * @since: 2020/6/10 23:27
 * @history: 1.2020/6/10 created by liangjun.wu
 */
@Component
@RabbitListener(queues = "hello")
public class RabbitReceiver {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void receive(String msg){
        logger.info("receive1 msg is "+msg);
    }
}
