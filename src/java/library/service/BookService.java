/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service;

import library.common.Book;
import library.data.BookDao;

/**
 *
 * @author hany
 */
public class BookService {
    
    private BookDao bookDao;
    
    public void add(Book book) {
        
        bookDao.add(book);
    }

    public void findAll() {
        
    }
    
}
