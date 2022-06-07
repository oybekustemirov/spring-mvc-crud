<%--
  Created by IntelliJ IDEA.
  User: oybekustemirov
  Date: 06/06/22
  Time: 00:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>

<style>
    table, td, th {
        border: 1px solid #ddd;
        text-align: left;
    }

    table {
        border-collapse: collapse;
        width: 100%;
    }

    th, td {
        padding: 15px;
    }
</style>

<body>


<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
<p><strong>Student List is Here | <a href="/student/add">Click for Create</a></strong>
    <br>
    <strong>Main Page | <a href="/index.jsp">Click for Main</a></strong></p>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Course</th>
        <th>Action</th>
    </tr>
    <c:forEach var="ketmon" items="${listStudent}">
        <tr>
            <td>${ketmon.id}</td>
            <td>${ketmon.name}</td>
            <td>${ketmon.email}</td>
            <td>${ketmon.course}</td>
            <td><a href="update/<c:out value='${ketmon.id}'/>">Update</a> | <a
                    href="delete/<c:out value='${ketmon.id}'/>">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
