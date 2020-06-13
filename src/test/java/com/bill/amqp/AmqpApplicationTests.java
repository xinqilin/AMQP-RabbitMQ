package com.bill.amqp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bill.amqp.entity.Book;

@SpringBootTest
class AmqpApplicationTests {

	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	
//	1對1
	@Test
	void contextLoads() {
//		rabbitTemplate.send(exchange,routeKey,message);
		
		//傳入send對象，自動序列化發送給rabbitmq
//		rabbitTemplate.convertAndSend(exchange, routingKey, object);
		
//		測試1
//		List<String> list=new ArrayList<>();
//		list.add("陣列中的第一個");
//		Map<String,Object> map=new HashMap<>();
//		map.put("msg1", "第一個訊息");
//		map.put("msg2", list.get(0));
//		rabbitTemplate.convertAndSend("bill","billKey",map);
		
		
//		測試2
		rabbitTemplate.convertAndSend("bill","billKey",new Book("Bill自傳","1234567890"));
		
	}
	
	
//	廣播
	@Test
	public void sendMsg() {
//		rabbitTemplate.convertAndSend("exchange","因為是廣播，不用寫key","msg");
		rabbitTemplate.convertAndSend("bill.news","",new Book("bill廣播", "987654321"));
	}
	
	
//	接收
	@Test
	public void receive() {
//		rabbitTemplate.receiveAndConvert("Queue的名字");
		Object msg=rabbitTemplate.receiveAndConvert("billQueue");
		System.out.println(msg.getClass());
		System.out.println(msg.toString());
		
	}
	
	


}
