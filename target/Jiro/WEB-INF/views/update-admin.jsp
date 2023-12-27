<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
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
			<br>
			<br>
			
			<label for="email">Email:</label>
			<form:input type="text" path="email" />
			<br>
			<br>

			<label for="phn">Phone no:</label>
			<br>
			<form:input type="text" path="phn" />
			<br>
			<br>

			<input type="submit" value="submit" />

		</form:form>
</body>
</html>