package com.bill.amqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Binding.DestinationType;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AmqpAdminTest {

	
	@Autowired
	AmqpAdmin amqpAdmin;
	
	
	@Test
	public void createExchange() {
//		amqpAdmin.declareExchange(new DirectExchange("billAmqpAdmin"));
		
//		amqpAdmin.declareQueue(new Queue("billQueueAdmin",true));
		
//		amqpAdmin.declareBinding(new Binding("billQueueAdmin", DestinationType.QUEUE,"billAmqpAdmin","billAdminKey",null));
//		System.out.println("amqp 自動新增完成");
		
		
	}
	
	
}
