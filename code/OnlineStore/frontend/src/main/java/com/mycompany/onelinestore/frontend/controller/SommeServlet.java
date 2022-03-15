package com.mycompany.onelinestore.frontend.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sommeServlet", urlPatterns = "/somme")
public class SommeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");

        int somme = Integer.parseInt(nombre1) + Integer.parseInt(nombre2);

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1> La somme des 2 nombres est " + somme + "</h1>");
        out.println("</body></html>");
    }
}
