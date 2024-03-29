package ru.itis.servlets;

import ru.itis.CombinatoricsOperations;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/permutations")
public class PermutationsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("permutations.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nValue = req.getParameter("n");
        int n = Integer.parseInt(nValue);
        String repetitions = req.getParameter("repetitions");
        if (n >= 0) {
            if (repetitions.isEmpty()) {
                req.setAttribute("message", CombinatoricsOperations.getPermutations(n));
                req.setAttribute("n", n);
            } else {
                List<Integer> repValues = new ArrayList<>();
                int sum = 0;
                for (String rep : repetitions.split(" ")) {
                    int x = Integer.parseInt(rep);
                    repValues.add(x);
                    sum += x;
                }
                if (sum == n) {
                    req.setAttribute("message", CombinatoricsOperations.getPermutations(n, repValues));
                    req.setAttribute("n", n);
                    req.setAttribute("repetitions", repetitions);
                }
                else {
                    req.setAttribute("message", "Данные некорректны");
                }
            }
        } else {
            req.setAttribute("message", "Данные некорректны");
        }
        req.getRequestDispatcher("permutations.ftl").forward(req, resp);
    }
}
