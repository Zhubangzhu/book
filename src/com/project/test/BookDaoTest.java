package com.project.test;

import com.project.dao.BookDao;
import com.project.dao.impl.BookDaoImpl;
import com.project.pojo.Book;
import com.project.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author bangzhu
 * @create 2020--18-9:53 PM
 */
public class BookDaoTest {

    private BookDao bookDao = new BookDaoImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"国哥为什么这么帅！", "191125", new
                BigDecimal(9999),1100000,0,null
        ));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);

    }

    @Test
    public void updateBook(){
        bookDao.updateBook(new Book(21,"大家都可以这么帅！", "国哥", new BigDecimal(9999),1100000,0,null
            ));
    }

    @Test
    public void queryBookById() {
        System.out.println( bookDao.queryBookById(21) );
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        System.out.println(bookDao.queryForPageTotalCountByPrice(10,20));
    }

    @Test
    public void queryForPageItems() {
        for (Book book : bookDao.queryForPageItems(8, Page.PAGE_SIZE)){
            System.out.println(book);
        }
    }

    @Test
    public void queryForPageItemsByPrice() {
        for (Book book : bookDao.queryForPageItemsByPrice(0, Page.PAGE_SIZE,10, 50 )){
            System.out.println(book);
        }
    }
}