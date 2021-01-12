package com.example.cfg;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.entity.Book;

//@Component doesn't need because @EnableConfigurationProperties(BookList.class) is in NoJpaConfig.java
@ConfigurationProperties(prefix = "fakebook")
public class BookList {

	List<Book> booklist ;

	public List<Book> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	
}
