package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Storage;
import model.Textile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class lab3Servlets extends HttpServlet {
    private final Storage storage = new Storage();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Textile> TextilesList = null;
        try {
            TextilesList = storage.getTextiles();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("textileList", TextilesList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/lab3.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String compound = request.getParameter("compound");
        String color = request.getParameter("color");
        String country = request.getParameter("country");
        String pattern = request.getParameter("pattern");

        Textile newTextile = new Textile(name, compound, color, country, pattern);


        try
        {
            storage.addTextile(newTextile);

            List<Textile> TextilesList = storage.getTextiles();
            request.setAttribute("textileList", TextilesList);

            doGet(request, response);
        }
        catch (SQLException e)
        {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Ошибка базы данных: " + e.getMessage());
        }

    }
}
