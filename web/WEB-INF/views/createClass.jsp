<%--
  Created by IntelliJ IDEA.
  User: oybekustemirov
  Date: 06/06/22
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h2>Class Create, Read, Update and Delete (CRUD) Example</h2>
<form action="addSinf" method="post" >
<pre>
    <strong>Create Here | <a href="/sinf/allSinf">Click for Read</a></strong>
     <strong>Main Page | <a href="/index.jsp">Click for Main</a></strong>

	Name: <input type="text" name="Class name"/>

	<input type="submit" value="Saqlash"/>
</pre>
</form>
${sinf}
</body>
</html>
