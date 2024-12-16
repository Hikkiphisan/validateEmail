<%--
  Created by IntelliJ IDEA.
  User: Mr Loc
  Date: 12/16/2024
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email Validate</h1>
<h3 style="color:red">${message}</h3>
<%--//messahe phai dap ung dieu kien thi moi hien thi ra, vay nen no da khong hien thi ngay lap tuc--%>
<form action="validate" method="post">
    <input type="text" name="email"><br>
    <input type="submit" value="Validate">
</form>
</body>
</html>