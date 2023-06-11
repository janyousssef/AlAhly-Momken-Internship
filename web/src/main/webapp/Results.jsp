<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>results</title>
</head>
<body bgcolor="cyan">
	<h1>
		<%
out.print(request.getAttribute("result"));
%><br>
	</h1>
	<%
if(request.getAttribute("isBig")=="true"){
	out.print("WOW! ");
	out.print(request.getAttribute("result"));
	out.print(" That's a big number!");
	
}
%>
	<h3>
		<a href="http://localhost:8080/web/SubmitNumbers.jsp"> Repeat!</a>
	</h3>
</body>
</html>