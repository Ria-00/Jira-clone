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
<title>Add Assigne</title>
</head>
<body>
<div align="center">

		<h2>New Assigne</h2>
		<br>
		<hr>
		<form:form action="insertassigneprocess" method="post" modelAttribute="user">

			<label for="uid">User Id</label>
			<form:input type="text" value=" " path="uid" />
			<form:errors path="uid" cssClass="error"></form:errors>
			<br>
			<br>
			<input type="submit" value="submit" />

		</form:form>
		<hr>

	</div>
</body>
</html>