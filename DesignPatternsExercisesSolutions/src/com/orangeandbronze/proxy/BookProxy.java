package com.orangeandbronze.proxy;

public class BookProxy extends Book {
	private final Book book;
	
	BookProxy(Book book) {
		this.book = book;
	}
	
	@Override
	public void setTitle(String title) {
		System.out.println("title being set to " + title);
		book.setTitle(title);
	}
	
	@Override
	public String getTitle() {
		return book.getTitle();
	}
	
	@Override
	public void setAuthor(String author) {
		System.out.println("author being set to " + author);
		book.setAuthor(author);
	}
	
	@Override
	public String getAuthor() {
		return book.getAuthor();
	}

	@Override
	public void setPublisher(String publisher) {
		System.out.println("publisher being set to " + publisher);
		book.setPublisher(publisher);  
	}
	
	@Override
	public String getPublisher() {
		return book.getPublisher();
	}
	
	
}
