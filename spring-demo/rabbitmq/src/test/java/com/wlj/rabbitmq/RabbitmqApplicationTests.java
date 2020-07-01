package com.wlj.rabbitmq;

import com.wlj.rabbitmq.sender.RabbitSender;
import com.wlj.rabbitmq.sender.TopicRabbitSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitmqApplicationTests {

	@Autowired
	private RabbitSender sender;

	@Autowired
	private TopicRabbitSender topicRabbitSender;

	@Test
	public void senderTest(){
		sender.sendMsg("hello rabbitmq");
	}

	@Test
	public void send2ManyTest(){
		for(int i=0;i<100;i++){
			sender.sendMsg("rabbitmq msg "+i);
		}
	}

	@Test
	public void sendTopicTest(){
		topicRabbitSender.send1();
		topicRabbitSender.send2();
	}

}
