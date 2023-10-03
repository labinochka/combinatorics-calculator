package ru.itis.servlets;

import ru.itis.CombinatoricsOperations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/combinations")
public class CombinationsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("placementsAndCombinations.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nValue = req.getParameter("n");
        String kValue = req.getParameter("k");
        String checkValue= req.getParameter("checkbox");
        Boolean repetitions = Boolean.parseBoolean(checkValue);
        if (nValue.isEmpty() || kValue.isEmpty()) {
            req.setAttribute("message", "Данные некорректны");
        }
        else {
            int k = Integer.parseInt(kValue);
            int n = Integer.parseInt(nValue);
            if (k < 0 || k > n) {
                req.setAttribute("message", "Данные некорректны");
            }
            else {
                req.setAttribute("message", CombinatoricsOperations.getCombinations(n, k, repetitions));
            }
        }
        req.getRequestDispatcher("placementsAndCombinations.ftl").forward(req, resp);
    }
}
