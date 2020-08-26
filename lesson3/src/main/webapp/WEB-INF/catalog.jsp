<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

    <title>Каталог</title>
  <%--  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>--%>
</head>
<body>
<%@include file="/WEB-INF/jspf/menu.jspf" %>
<h1>Каталог</h1>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th> id</th>
            <th> name</th>
            <th> description</th>
            <th> price</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${requestScope.products}">
                <tr>
                    <td>
                        <c:out value="${item.id}"/>
                    </td>
                    <td>
                        <c:out value="${item.name}"/>
                    </td>
                    <td>
                        <c:out value="${item.description}"/>
                    </td>
                    <td>
                        <c:out value="${item.price}"/>
                    </td>
                </tr>

            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>

