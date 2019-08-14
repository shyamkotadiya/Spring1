<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@taglib prefix="a" uri="http://java.sun.com/jstl/core_rt" %>

<table border="1px black">

	<a:forEach items="${data}" var="i">
	<tr>
		
		<td>${i.id}</td>
		<td>${i.fn}</td>
		<td>${i.ln}</td>
		<td>${i.un}</td>
		<td>${i.pw}</td>
		<td><a href="delete.html?id1=${i.id}">DELETE</a></td>
		<td><a href="editload.html?id2=${i.id}">EDIT</a></td>
		
	</tr>
	</a:forEach>
</table>


</body>
</html>