<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin-login</title>
</head>
<body>
	<h1>LOGIN</h1>
	<form:form action="loginprocess" method="post" modelAttribute="admin">
		<p style="color: red">${err}</p>
		<br>
		<label for="username">Username:</label>
		<form:input type="text" path="aid" />
		<label for="pass">Password:</label>
		<form:input type="password" path="pass" />
		<p style="color: red">${error}</p>
		<br>
		<br>
		<input type="submit" value="Login">

	</form:form>
</body>
</html>