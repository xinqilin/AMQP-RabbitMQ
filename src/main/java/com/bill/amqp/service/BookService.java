package com.bill.amqp.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.bill.amqp.entity.Book;

@Service
public class BookService {

	@RabbitListener(queues="billQueue")
	public void receive(Book book) {
		System.out.println("service收到book");
		System.out.println(book);
	}
}
