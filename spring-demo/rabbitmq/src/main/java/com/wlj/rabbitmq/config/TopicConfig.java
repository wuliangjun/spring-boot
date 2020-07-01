package com.wlj.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: liangjun.wu
 * @since: 2020/6/11 0:16
 * @history: 1.2020/6/11 created by liangjun.wu
 */
@Configuration
public class TopicConfig {

    final String message = "topic-msg";
    final String messages = "topic-messages";

    /**
     *  声明一个名称为topic-msg的队列
     * @return
     */
    @Bean
    public Queue queueMessage1(){
        return new Queue(this.message);
    }

    /**
     *  声明一个名称为topic-messages的队列
     * @return
     */
    @Bean
    public Queue queueMessage2(){
        return new Queue(this.messages);
    }

    /**
     *  在mq上建立一个topic交换机
     * @return
     */
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("my-topic-exchange");
    }

    /**
     *  将queueMessage1的队列绑定到topic交换机，并监听路由键：topic.msg
     * @param queueMessage1
     * @param topicExchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage1,TopicExchange topicExchange){
        return BindingBuilder.bind(queueMessage1).to(topicExchange).with("topic.msg");
    }

    /**
     *  将queueMessage2的队列绑定到topic交换机，并监听路由键：topic.#
     *  监听topic.#后，意味着queueMessage2和queueMessage1的队列都会收到topic.msg
     * @param queueMessage2
     * @param topicExchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessages(Queue queueMessage2,TopicExchange topicExchange){
        return BindingBuilder.bind(queueMessage2).to(topicExchange).with("topic.#");
    }
}
