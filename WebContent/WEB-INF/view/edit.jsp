<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="e" uri="http://java.sun.com/jstl/core_rt" %>


<e:forEach items="${data}" var="j">

<s:form action="edit.html" method="post" modelAttribute="data1">

	fn:<s:input type="text" path="fn" value="${j.fn}" /><br>
	
	ln:<s:input type="text" path="ln" value="${j.ln}"/><br>
	
	un:<s:input type="text" path="un" value="${j.un}"/><br>
	
	pw:<s:input type="password" path="pw" value="${j.pw}"/><br>
	
	<s:hidden path="id" value="${j.id}"/>
	
	<input type="submit" value="submit">
	
</s:form>	
</e:forEach>	
</body>
</html>