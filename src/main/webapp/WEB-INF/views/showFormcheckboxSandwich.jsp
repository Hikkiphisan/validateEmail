<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sandwich Condiments</title>
</head>
<body>
<h2>Select Condiments for Your Sandwich</h2>

<!-- Chèn đoạn mã JavaScript để log condiments ra console -->
<script>
    // Log dữ liệu condiments ra console
    console.log("Condiments received from Controller: ");
    var condiments = ${condiments};  // Truyền dữ liệu từ controller vào JavaScript
</script>

<h3>Hi ${sample}</h3>

<!-- Form để chọn gia vị -->
<form action="save" method="post">
    <c:forEach var="condiment" items="${condiments}">
        <input type="checkbox" name="condiment" value="${condiment}">${condiment}<br>
    </c:forEach>
    <input type="submit" value="Save">
</form>
</body>
</html>
