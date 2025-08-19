<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New PG</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="container mt-5">

<h2>Add New PG</h2>

<form action="addPG" method="post">
    <div class="mb-3">
        <label for="name" class="form-label">PG Name</label>
        <input type="text" class="form-control" id="name" name="name" required/>
    </div>

    <div class="mb-3">
        <label for="address" class="form-label">Address</label>
        <textarea class="form-control" id="address" name="address" rows="3" required></textarea>
    </div>

    <div class="mb-3">
        <label for="rent" class="form-label">Rent (₹)</label>
        <input type="number" class="form-control" id="rent" name="rent" required min="0"/>
    </div>

    <div class="mb-3">
        <label for="description" class="form-label">Description</label>
        <textarea class="form-control" id="description" name="description" rows="3"></textarea>
    </div>

    <button type="submit" class="btn btn-success">Add PG</button>
    <a href="home" class="btn btn-secondary">Cancel</a>
</form>

</body>
</html>
