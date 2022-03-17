package com.mycompany.geometrie.backend.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "HomeServlet", urlPatterns = "/main-servlet")
public class MainControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String operationEffectuee = request.getParameter("operationEffectuee");

        if (operationEffectuee == null) {
            // Redirection
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ask-operation.jsp");
            requestDispatcher.forward(request, response);
        }

        switch (operationEffectuee){
            case ("ask-operation"):
                String operation = request.getParameter("operation");

                // Création de la session (ou récupération si déjà crée)
                HttpSession session = request.getSession();
                session.setAttribute("operation", operation);

                // Redirection
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ask-figure.jsp");
                requestDispatcher.forward(request, response);
        }


    }

}
