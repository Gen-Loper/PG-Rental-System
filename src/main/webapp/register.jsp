<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Register - PG Rental</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container mt-5">
    <h2>Register</h2>

    <% String error = (String) request.getAttribute("errorMessage"); %>
    <% if (error != null) { %>
        <div class="alert alert-danger"><%= error %></div>
    <% } %>

    <form action="register" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Full Name</label>
            <input type="text" class="form-control" id="name" name="name" required/>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <input type="email" class="form-control" id="email" name="email" required/>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password" name="password" required/>
        </div>
        <button type="submit" class="btn btn-primary">Register</button>
        <p class="mt-3">Already have an account? <a href="login.jsp">Login here</a></p>
    </form>
</body>
</html>
