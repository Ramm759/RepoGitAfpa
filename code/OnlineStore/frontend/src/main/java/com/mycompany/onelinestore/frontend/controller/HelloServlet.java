package com.mycompany.onelinestore.frontend.controller;

//import com.mycompany.backend.entity.Person;

import com.mycompany.onlinestore.backend.entity.Person;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = ("/hello"))
public class HelloServlet extends HttpServlet {
    private String message;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        Person durand = new Person("David", "Dupond");

        PrintWriter out = resp.getWriter(); // ouverture flux en écriture
        resp.setContentType("text/html");
        
        String message = "Hello " + durand.getFirstname() + " " + durand.getLastname() + " from Frontend";
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}
