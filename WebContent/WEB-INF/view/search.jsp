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



<s:form action="search.html" method="post" modelAttribute="data">

	Search:<s:input type="text" path="fn"/><br>
	
	<input type="submit" value="submit">
	
</s:form>



</body>
</html>