package com.twg.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twg.springboot.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {

}