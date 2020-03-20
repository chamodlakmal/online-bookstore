package com.chamiviews.online.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.chamiviews.online.book.store.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long>{
	
}
