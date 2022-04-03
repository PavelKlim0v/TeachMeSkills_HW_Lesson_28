package com.teachmeskills.lesson_28.web.servlet;

import com.teachmeskills.lesson_28.entity.User;
import com.teachmeskills.lesson_28.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {

    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/authorization.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = userService.findUserByLogin(login);

        if (user == null) {
            System.out.println("User does not exist");

        } else if (user.getPassword().equals(password)) {
            req.getSession().setAttribute("user", user);

        } else {
            resp.getWriter().println("Wrong Password!");
        }
        getServletContext().getRequestDispatcher("/_header.jsp").forward(req, resp);
    }

}
