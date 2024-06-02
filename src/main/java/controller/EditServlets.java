package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Storage;
import model.Textile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = {"/edit"})
public class EditServlets extends HttpServlet {
    private final Storage storage = new Storage();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try
        {
            storage.updateTextileById(id, new Textile(
                    "edit info",
                    "edit info",
                    "edit info",
                    "edit info",
                    "edit info"
            ));
            List<Textile> TextilesList = storage.getTextiles();
            request.setAttribute("textileList", TextilesList);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/lab3.jsp");
            requestDispatcher.forward(request, response);
        }
        catch (SQLException e)
        {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Ошибка базы данных: " + e.getMessage());
        }
    }
}
