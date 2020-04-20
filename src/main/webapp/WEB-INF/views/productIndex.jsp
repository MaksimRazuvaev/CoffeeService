<%--
  Created by IntelliJ IDEA.
  User: 12068
  Date: 4/19/2020
  Time: 1:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<table>
    <th>id</th>
    <th>productName</th>
    <th>price</th>
    <th>categoryId</th>
    <th>supplierId</th>
    <c:forEach items="${productsForJsp}" var = "product">
        <tr>${product.id}</tr>
        <tr>${product.productName}</tr>
        <tr>${product.price}</tr>
        <tr>${product.categoryId}</tr>
        <tr>${product.supplierId}</tr>
    </c:forEach>
</table>

</body>
</html>
