package com.hust.springboot.dao;


import com.hust.springboot.entity.Book;

/**
 * Created by fangzhipeng on 2017/4/19.
 */
public interface BookRepository {
    Book getByIsbn(String isbn);
}
