package com.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.cart.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
