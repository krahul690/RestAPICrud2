package com.being.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.being.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
