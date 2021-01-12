package com.example.cfg;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.entity.Book;
import com.example.repo.BookRepository;

@Profile("dev")
@Configuration
@EnableAutoConfiguration(exclude = {
	DataSourceAutoConfiguration.class,
	DataSourceTransactionManagerAutoConfiguration.class,
	HibernateJpaAutoConfiguration.class
})
@EnableConfigurationProperties(BookList.class)
public class NoJpaConfig {

	@Autowired BookList booklist ;
	
	@Bean
	public BookRepository bookRepository() {
		return new FakeAbstractBookRepositoryImpl(){
			@Override
			public Iterable<Book> findAll() {
				return booklist.getBooklist();
			}
		} ;
	}
	
}

abstract class FakeAbstractBookRepositoryImpl implements BookRepository{

	@Override
	public <S extends Book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Book> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Book> findByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Book> findByLang(String language) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Book> findByTitleLike(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Book> queryAuthorAndTitle(String author, String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
