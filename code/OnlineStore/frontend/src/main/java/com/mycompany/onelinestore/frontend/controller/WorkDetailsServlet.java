package com.mycompany.onelinestore.frontend.controller;

import com.mycompany.onlinestore.backend.entity.Catalogue;
import com.mycompany.onlinestore.backend.entity.Work;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WorkDetailServlet", urlPatterns = "/work-details")
public class WorkDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Long id = Long.parseLong(request.getParameter("id"));

        Work work = null;

        for (Work work1 : Catalogue.listOfWorks){
            if (id == work1.getId()){
                work = work1;
                break;
            }
        }

        request.setAttribute("work", work);

        // Redirection
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/work-details.jsp");
        requestDispatcher.forward(request, response);
    }
}
