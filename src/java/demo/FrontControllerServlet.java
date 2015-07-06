/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hany
 */
public class FrontControllerServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        String book = request.getPathInfo().substring(1);
        
        switch (book) {
            case "book1" : 
                request.getRequestDispatcher("/books/book1.jsp").forward(request, response);
                break;
            case "book2" : 
                request.getRequestDispatcher("/books/book2.jsp").forward(request, response);
                break;
            case "book3" :
                request.getRequestDispatcher("/books/book3.jsp").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("/index.html").forward(request, response);
        }
        
        
//        request.getRequestDispatcher("/books/" + book + ".jsp").forward(request, response);
        
        
//        PrintWriter out = response.getWriter();
        
//        out.println( "RequestURL  : " + request.getRequestURL() );
//        out.println( "RequestURI  : " + request.getRequestURI() );
//        out.println( "ContextPath : " + request.getContextPath() );
//        out.println( "ServletPath : " + request.getServletPath() );
//        out.println( "PathInfo    : " + request.getPathInfo() );
//        out.println( "QueryString : " + request.getQueryString() );
        
        
    }
    
    
}
