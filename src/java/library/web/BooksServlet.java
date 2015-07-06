/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.web;

import library.common.Book;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import library.service.BookService;

/**
 *
 * @author hany
 */
public class BooksServlet extends HttpServlet{
    
    private BookService bookService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        switch(request.getPathInfo()) {
            
            case "add" :
                Book book = new Book();
                // TODO : set properties of book from parameters
                
                bookService.add(book);
                break;
            case "update" :
                break;
            case "delete" :
            default:
                bookService.findAll();
        }
        
        
    }
    
    
    
    
}
