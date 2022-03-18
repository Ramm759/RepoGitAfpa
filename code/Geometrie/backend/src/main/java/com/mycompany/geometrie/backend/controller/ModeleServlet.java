package com.mycompany.geometrie.backend.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class ModeleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String nombre1 = request.getParameter("nombre1");
        Long release = Long.parseLong(request.getParameter("release"));

        double perimetre = 4;

        request.setAttribute("perimetre", perimetre);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/catalogue.jsp");
        requestDispatcher.forward(request, response);
    }
}
