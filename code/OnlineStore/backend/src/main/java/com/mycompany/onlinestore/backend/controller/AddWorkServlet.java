package com.mycompany.onlinestore.backend.controller;

import com.mycompany.onlinestore.backend.entity.Artist;
import com.mycompany.onlinestore.backend.entity.Catalogue;
import com.mycompany.onlinestore.backend.entity.Work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/add-work")
public class AddWorkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String title = req.getParameter("title");
        Integer release = Integer.parseInt(req.getParameter("release"));
        String genre = req.getParameter("genre");
        String summary = req.getParameter("summary");
        String mainArtistName = req.getParameter("mainArtistName");

        Artist mainArtist = new Artist(mainArtistName);

        Work work = new Work();
        work.setTitle(title);
        work.setRelease(release);
        work.setGenre(genre);
        work.setSummary(summary);
        work.setMainArtist(mainArtist);

        Catalogue.listOfWorks.add(work);

        PrintWriter out = resp.getWriter();
        String message = "L'oeuvre a bien été ajoutée au catalogue";

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println(("<a href=\"catalogue\">Retour au catalogue</a>"));
        out.println("</body></html>");
    }
}