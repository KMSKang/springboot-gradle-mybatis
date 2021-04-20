<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World!</title>
</head>
<body>
<c:forEach var="row" items="${rows}">
<p>${row.id}</p>
<p>${row.title}</p>
<p>${row.content}</p>
</c:forEach>
</body>
</html>