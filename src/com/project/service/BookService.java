package com.project.service;

import com.project.pojo.Book;
import com.project.pojo.Page;

import java.util.List;

/**
 * @author bangzhu
 * @create 2020-07-18-10:04 PM
 */
public interface BookService {
    public void addBook(Book book);
    public void deleteBookById(Integer id);
    public void updateBook(Book book);
    public Book queryBookById(Integer id);
    public List<Book> queryBooks();

    Page<Book> page(int pageNo, int pageSize);

    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);
}
