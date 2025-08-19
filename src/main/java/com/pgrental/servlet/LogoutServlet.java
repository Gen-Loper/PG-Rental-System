package com.pgrental.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false); // get existing session, if any
        if (session != null) {
            session.invalidate(); // invalidate session to log out
        }

        response.sendRedirect("login.jsp"); // redirect to login page after logout
    }
}
