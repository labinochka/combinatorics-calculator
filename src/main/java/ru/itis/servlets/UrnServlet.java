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

@WebServlet("/urn")
public class UrnServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("urn.ftl").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nValue = req.getParameter("n");
        String mValue = req.getParameter("m");
        String kValue = req.getParameter("k");
        String rValue = req.getParameter("r");
        int n = Integer.parseInt(nValue);
        int m = Integer.parseInt(mValue);
        int k = Integer.parseInt(kValue);
        if (k >= 0 && n >= m && m >= k) {
            if (rValue.isEmpty()) {
                req.setAttribute("message", CombinatoricsOperations.getUrnModel(n, m, k));
                req.setAttribute("n", n);
                req.setAttribute("m", m);
                req.setAttribute("k", k);
            } else {
                int r = Integer.parseInt(rValue);
                if (k >= r) {
                    req.setAttribute("message", CombinatoricsOperations.getUrnModel(n, m, k, r));
                    req.setAttribute("n", n);
                    req.setAttribute("m", m);
                    req.setAttribute("k", k);
                    req.setAttribute("r", r);
                }
                else {
                    req.setAttribute("message", "Данные некорректны");
                }
            }
        } else {
            req.setAttribute("message", "Данные некорректны");
        }
        req.getRequestDispatcher("urn.ftl").forward(req, resp);
    }
}
