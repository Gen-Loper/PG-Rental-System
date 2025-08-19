<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Welcome to PG Rental System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
    <style>
        body {
            background: linear-gradient(135deg, #6B73FF 0%, #000DFF 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            color: white;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .container {
            text-align: center;
            max-width: 600px;
            background: rgba(255,255,255,0.1);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 8px 30px rgba(0,0,0,0.3);
        }
        h1 {
            font-weight: 700;
            margin-bottom: 20px;
            letter-spacing: 2px;
        }
        p.lead {
            font-size: 1.25rem;
            margin-bottom: 30px;
        }
        .btn-primary, .btn-success {
            width: 140px;
            margin: 0 15px;
            font-weight: 600;
            letter-spacing: 1px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to PG Rental System</h1>
        <p class="lead">Find, Add, and Manage Paying Guest Accommodations easily.</p>
        <div>
            <a href="register.jsp" class="btn btn-success btn-lg">Register</a>
            <a href="login.jsp" class="btn btn-primary btn-lg">Login</a>
        </div>
    </div>
</body>
</html>
