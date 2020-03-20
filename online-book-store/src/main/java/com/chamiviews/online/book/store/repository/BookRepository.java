package com.chamiviews.online.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.chamiviews.online.book.store.entity.Book;

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long>{
	
}
