package com.bill.amqp.entity;

public class Book {
	private String bookName;
	private String bookISBN;
	
	
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String bookISBN) {
		super();
		this.bookName = bookName;
		this.bookISBN = bookISBN;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookISBN=" + bookISBN + "]";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	

}
