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
<title>Update Admin</title>
</head>
<body>
<h1>Update Details</h1>
<br>
<br>
<form:form action="updateadminprocess" method="post" modelAttribute="admin">


			<label for="name">Name:</label>
			<form:input type="text" path="name" />
			<form:errors path="name" cssClass="error"></form:errors>
			<br>
			<br>
			
			<label for="email">Email:</label>
			<form:input type="text" path="email" />
			<form:errors path="email" cssClass="error"></form:errors>
			<br>
			<br>

			<label for="phn">Phone no:</label>
			<br>
			<form:input type="text" path="phn" />
			<form:errors path="phn" cssClass="error"></form:errors>
			<br>
			<br>

			<input type="submit" value="submit" />

		</form:form>
</body>
</html>