package com.spring.sjlian.service.Impl;

import com.spring.sjlian.dao.BookDAO;
import com.spring.sjlian.model.Book;
import com.spring.sjlian.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层实现
 * Created by lian on 17/7/13.
 */
@Service
public class BookService implements IBookService{
    @Autowired
    private BookDAO bookDAO;
    public List<Book> queryAll(int offset, int limit) {
        return bookDAO.queryAll(offset,limit);
    }
}
