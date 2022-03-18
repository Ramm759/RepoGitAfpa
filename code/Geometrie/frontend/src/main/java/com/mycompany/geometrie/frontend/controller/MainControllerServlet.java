package com.mycompany.geometrie.frontend.controller;

import com.mycompany.geometrie.backend.entity.Carre;

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

        // Création de la session (ou récupération si déjà crée)
        HttpSession session = request.getSession();

        // Redirection
        RequestDispatcher requestDispatcher;

        String operationEffectuee = request.getParameter("operationEffectuee");

        if (operationEffectuee == null){
            // Redirection
            requestDispatcher = request.getRequestDispatcher("/ask-operation.jsp");
            requestDispatcher.forward(request, response);
        }

        switch (operationEffectuee){
            case ("ask-operation"):
                String operation = request.getParameter("operation");
                session.setAttribute("operation", operation);

                // Redirection
                requestDispatcher = request.getRequestDispatcher("/ask-figure.jsp");
                requestDispatcher.forward(request, response);
                break;

            case ("ask-figure"):
                String figure = request.getParameter("figure");
                Double cote = Double.parseDouble(request.getParameter("cote"));

                // Récupérer les autres valeurs

                if (figure.equals("carre")){
                    Carre carre = new Carre(cote);
                    Double perimetre = carre.calculerPerimetre();
                    Double surface = carre.calculerSurface();

                    session.setAttribute("perimetre", perimetre);

                    // Redirection
                    requestDispatcher = request.getRequestDispatcher("/affich-result.jsp");
                    requestDispatcher.forward(request, response);
                }


        }


    }
}
