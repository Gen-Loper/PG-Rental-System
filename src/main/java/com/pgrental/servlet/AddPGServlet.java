package com.pgrental.servlet;

import com.pgrental.dao.PGDAO;
import com.pgrental.model.PG;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddPGServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    HttpSession session = request.getSession();
	    Integer userId = (Integer) session.getAttribute("userId");

	    if (userId == null) {
	        response.sendRedirect("login.jsp");
	        return;
	    }

	    String name = request.getParameter("name");
	    String address = request.getParameter("address");
	    int rent = Integer.parseInt(request.getParameter("rent"));
	    String description = request.getParameter("description");

	    PG pg = new PG();
	    pg.setName(name);
	    pg.setAddress(address);
	    pg.setRent(rent);
	    pg.setDescription(description);
	    pg.setUserId(userId);

	    PGDAO.addPG(pg);

	    // Redirect to home page to see the updated list
	    response.sendRedirect("home");
	}

}
