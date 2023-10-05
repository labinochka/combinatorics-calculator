package ru.itis.servlets;

import ru.itis.CombinatoricsOperations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/placements")
public class PlacementsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("placements.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nValue = req.getParameter("n");
        String kValue = req.getParameter("k");
        String checkValue = req.getParameter("checkbox");
        Boolean repetitions = Boolean.parseBoolean(checkValue);
        int k = Integer.parseInt(kValue);
        int n = Integer.parseInt(nValue);
        if (k < 0 || n < 0) {
            req.setAttribute("message", "Данные некорректны");
        } else {
            if (repetitions || n >= k) {
                req.setAttribute("message", CombinatoricsOperations.getPlacements(n, k, repetitions));
                req.setAttribute("n", n);
                req.setAttribute("k", k);
            }
            else {
                req.setAttribute("message", "Данные некорректны");
            }
        }
        req.getRequestDispatcher("placements.ftl").forward(req, resp);
    }
}
