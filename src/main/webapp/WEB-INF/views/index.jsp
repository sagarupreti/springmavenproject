<%-- 
    Document   : index
    Created on : Dec 21, 2018, 12:54:44 PM
    Author     : ideapad-520S
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World Spring Framework!..</h1>
        <c:forEach var="course" items="${courses}">
        <li style="font-weight: bold">${course.name} (${couse.fees})</li>
        </c:forEach>
    </body>
</html>
