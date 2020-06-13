package com.bill.amqp;

import java.util.HashMap;
import java.util.Map;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AmqpApplicationTests {

	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@Test
	void contextLoads() {
//		rabbitTemplate.send(exchange,routeKey,message);
		
		//傳入send對象，自動序列化發送給rabbitmq
//		rabbitTemplate.convertAndSend(exchange, routingKey, object);
		
		Map<String,Object> map=new HashMap<>();
		map.put("msg1", "第一個訊息");
//		map.put("msg2", Arrays.asList("陣列中的第一個"));
		rabbitTemplate.convertAndSend("bill","billKey",map);
	}

}
