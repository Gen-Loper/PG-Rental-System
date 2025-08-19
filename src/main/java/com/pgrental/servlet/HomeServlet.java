package com.pgrental.servlet;

import com.pgrental.dao.PGDAO;
import com.pgrental.model.PG;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Integer userId = (Integer) session.getAttribute("userId");

        if (userId == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        List<PG> pgList = PGDAO.getPGsByUserId(userId);
        request.setAttribute("pgList", pgList);
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }
}

