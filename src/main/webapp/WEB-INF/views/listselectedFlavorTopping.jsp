<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Selected Condiments</title>
</head>
<body>
<h2>Selected Condiments:</h2>
<ul>
    <c:forEach var="condiment" items="${condiment}">
        <li>${condiment}</li>
    </c:forEach>
</ul>
</body>
</html>