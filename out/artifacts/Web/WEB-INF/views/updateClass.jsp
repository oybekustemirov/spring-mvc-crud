<%--
  Created by IntelliJ IDEA.
  User: oybekustemirov
  Date: 07/06/22
  Time: 00:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
<p><strong>Update Here | <a href="/sinf/allSinf">Click for Read</a></strong></p>
<form action="/sinf/updateSinf" method="post">
<pre>
<c:forEach var="sin" items="${sinf}">

    Id: <input type="number" name="id" value="${sin.id}" disabled="disabled"/>
    <input type="hidden" name="id" value="${sin.id}"/>
    Name: <input type="text" name="Class name" value="${sin.name}"/>


    <input type="submit" value="Update"/>
</c:forEach>
</pre>
</form>
${msg}
</body>
</html>
