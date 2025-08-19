package com.pgrental.servlet;

import com.pgrental.dao.UserDAO;
import com.pgrental.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        boolean result = UserDAO.registerUser(user);

        if (result) {
            response.sendRedirect("login.jsp");
        } else {
            request.setAttribute("errorMessage", "Email already registered. Please log in.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}
