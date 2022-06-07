<%--
  Created by IntelliJ IDEA.
  User: oybekustemirov
  Date: 06/06/22
  Time: 00:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
<form action="add" method="post" >
<pre>
    <strong>Create Here | <a href="/student/all">Click for Read</a></strong>
	<strong>Main Page | <a href="/index.jsp">Click for Main</a></strong>

	Name: <input type="text" name="name"/>

	Email: <input type="text" name="email"/>

	Course: <input type="text" name="course"/>

	<input type="submit" value="Saqlash"/>
</pre>
</form>
${ketmon}
</body>
</html>
