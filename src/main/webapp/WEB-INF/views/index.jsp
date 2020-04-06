<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category</title>
</head>
<body>
<table>
    <th>id</th>
    <th>name</th>
    <c:forEach items="${categoriesForJsp}" var="category">
        <tr>
            <td>${category.id}</td>
            <td>${category.categoryName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
