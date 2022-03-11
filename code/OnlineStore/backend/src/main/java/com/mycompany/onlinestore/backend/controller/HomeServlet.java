package com.mycompany.onlinestore.backend.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String message = "Online Store, votre boutique en ligne (Frontend)";

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println(("<a href=\"login.html\">Login</a>"));

        out.println(("<a href=\"catalogue\">Catalogue des oeuvres</a></br></br>"));
        out.println(("<a href=\"add-work-form.html\">Ajouter une oeuvre</a>"));
        out.println("</body></html>");
    }
}
