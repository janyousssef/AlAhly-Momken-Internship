<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
	<form:form action="admin_panel" modelAttribute="user">  
         name: <form:input path="name" />
		<br>
        password: <form:input path="pass" />
		<br>
Gender: 
<form:select path="gender" items="${genders}" />
		<br>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
