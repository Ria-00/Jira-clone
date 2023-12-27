<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red
}
</style>
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
		<form:errors path="pass" cssClass="error"></form:errors>
		<p style="color: red">${error}</p>
		<br>
		<br>
		<input type="submit" value="Login">

	</form:form>
</body>
</html>