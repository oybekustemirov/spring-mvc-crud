<%--
  Created by IntelliJ IDEA.
  User: oybekustemirov
  Date: 06/06/22
  Time: 23:55
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
<h2>Sinf Create, Read, Update and Delete (CRUD) Example</h2>
<p><strong>Student List is Here | <a href="/sinf/addSinf">Click for Create</a></strong>
    <br>
    <strong>Main Page | <a href="/index.jsp">Click for Main</a></strong></p>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>
    <c:forEach var="sinf" items="${listSinf}">
        <tr>
            <td>${sinf.id}</td>
            <td>${sinf.name}</td>
            <td><a href="update/<c:out value='${sinf.id}'/>">Update</a> | <a
                    href="delete/<c:out value='${sinf.id}'/>">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
