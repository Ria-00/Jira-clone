<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
<h1 align="center">Admin Profile</h1>
	<br>
	<div align="center">

		<table border=1>
			<thead>
				<tr>
					<td>Name</td>
					<td>Phone No.</td>
					<td>Email</td>
				</tr>
			</thead>
				<tr>
					<td>${user.name}</td>
					<td>${user.phn}</td>
					<td>${user.email}</td>
				</tr>
		</table>
		<br>
		<a href="/Jiro/admin/home">Back to home</a>
	</div>
</body>
</html>