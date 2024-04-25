<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px">
<tr>
<th>ID</th>
<th>NAME</th>
<th>EMAIL</th>
<th>PASS</th>
<th>ACTION</th>
</tr>

<c:forEach items="${k}" var="e">
<tr>
<td>${e.aid}</td>
<td>${e.aname}</td>
<td>${e.aemail}</td>
<td>${e.apass}</td>
<td>
<a href="edit/${e.aid}">Edit</a> |
<a href="del/${e.aid}">Delete</a>
</td>
</tr>
</c:forEach>

</table>
</body>
</html>