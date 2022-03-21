package com.mycompany.geometrie.frontend.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "EssaiDB", urlPatterns = "/essaiDb")
public class TestBdServlet extends HttpServlet {

    Connection conn = null;



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tennis?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=Europe/Paris","COURSDB","COURSDB");


            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT ID, NOM, PRENOM FROM JOUEUR");

            while (rs.next()){
                final String nom = rs.getString("NOM");
                final String prenom = rs.getString("PRENOM");
                final Long id = rs.getLong("ID");
                out.println("Le joueur numero " + id + " est " +nom + " " +prenom + ".<br/>");
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }
        finally {
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


