package com.teachmeskills.lesson_28.web.servlet;

import com.teachmeskills.lesson_28.entity.Operation;
import com.teachmeskills.lesson_28.service.CalcService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/history")
public class CalcHistoryServlet extends HttpServlet {

    private final CalcService calcService = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operation> all = calcService.findAll();
        req.setAttribute("all", all);
        getServletContext().getRequestDispatcher("/history.jsp").forward(req, resp);
    }

}