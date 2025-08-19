<%@ page import="java.util.List, com.pgrental.model.PG" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>My PG Listings</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container mt-5">

<%
    String userName = (String) session.getAttribute("userName");
    if (userName == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<h2>Welcome, <%= userName %>!</h2>

<div class="mb-3">
    <a href="addPG.jsp" class="btn btn-primary">Add New PG</a>
    <a href="logout" class="btn btn-danger float-end">Logout</a>
</div>

<table class="table table-bordered table-striped">
    <thead class="table-dark">
        <tr>
            <th>PG Name</th>
            <th>Address</th>
            <th>Rent (₹)</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
    <%
        List<PG> pgList = (List<PG>) request.getAttribute("pgList");
        if (pgList != null && !pgList.isEmpty()) {
            for (PG pg : pgList) {
    %>
        <tr>
            <td><%= pg.getName() %></td>
            <td><%= pg.getAddress() %></td>
            <td><%= pg.getRent() %></td>
            <td><%= pg.getDescription() %></td>
        </tr>
    <%
            }
        } else {
    %>
        <tr>
            <td colspan="4" class="text-center">No PG listings found.</td>
        </tr>
    <%
        }
    %>
    </tbody>
</table>

</body>
</html>
