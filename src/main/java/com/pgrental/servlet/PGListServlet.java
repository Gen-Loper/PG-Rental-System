package com.pgrental.servlet;

import com.pgrental.DBConnection;
import com.pgrental.dao.PGDAO;
import com.pgrental.model.PG;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PGListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        int userId = (Integer) req.getSession().getAttribute("userId");

        try {
            PGDAO dao = new PGDAO();
            List<PG> pgList = PGDAO.getPGsByUserId(userId);
            req.setAttribute("pgList", pgList);
            req.getRequestDispatcher("home.jsp").forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
