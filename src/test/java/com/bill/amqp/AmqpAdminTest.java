package com.bill.amqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AmqpAdminTest {

	
	@Autowired
	AmqpAdmin amqpAdmin;
	
	
	@Test
	public void createExchange() {
		amqpAdmin.declareExchange(new DirectExchange("billAmqpAdmin"));
		System.out.println("amqp 自動新增完成");
	}
	
	
}
