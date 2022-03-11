package com.mycompany.onlinestore.backend.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = "/test1")
public class ModeleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String nombre1 = req.getParameter("nombre1");
        Integer nombre2 = Integer.parseInt(req.getParameter("nombre2"));

        PrintWriter out = resp.getWriter();
        String message = "Online Store, votre boutique en ligne (Backend)";

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println(("<a href=\"catalogue\">Catalogue des oeuvres</a>"));
        out.println("</body></html>");
    }
}
