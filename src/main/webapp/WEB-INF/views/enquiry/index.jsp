<%-- 
    Document   : index
    Created on : Dec 21, 2018, 3:19:07 PM
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
        <h1>Contact Us</h1>
        <form method="post" action="">
            <div>
                <label>First Name</label>
                <input type="text" name="firstName" required="required"/>
            </div>
            <div>
                <label>Last Name</label>
                <input type="text" name="lastName" required="required"/>
            </div>
            
            <div>
                <label>Email</label>
                <input type="email" name="emial" required="required"/>
            </div>
            <div>
                <label>Contact No</label>
                <input type="text" name="contactNo" required="required"/>
            </div>
            <div>
                <label>Course</label>
                <select name="courseId" required="required">
                    <option value="0">Select Course</option> 
                    <c:forEach var="course" items="${courses}">
                        <option value="${course.id}">${course.name}</option>
                    </c:forEach>
                </select>
            </div>
            <button type="submit" name="submit">Send</button>
        </form>
    </body>
</html>
