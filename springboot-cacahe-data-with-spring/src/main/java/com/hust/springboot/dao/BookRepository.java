package com.hust.springboot.dao;


import com.hust.springboot.entity.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
