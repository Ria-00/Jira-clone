<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Assignes</title>
</head>
<body>
<h1 align="center">Project Assigne</h1>
<br>
	<div align="center">

		<table border=1>
			<thead>
				<tr>
					<td>User Id</td>
					<td>User Name</td>
					<td>User Email</td>
					<td>Operation</td>
				</tr>
			</thead>

			
			<c:forEach var="p" items="${list}">
				<tr>
					<td>${p.uid }</td>
					<td>${p.name}</td>
					<td>${p.email }</td>
					<td><a
						href="deleteassigne?id=${p.uid}"
						onclick="if (!(confirm('Do you really want to delete this assigne?'))) return false">Delete</a>
					</td>
				</tr>
			
		</c:forEach>
		</table>
		<br>
		<a href="/Jiro/admin/insertassigne"><button>Add Assigne</button></a><br>
		<br>
		<a href="/Jiro/admin/home"><button>Back to home</button></a>
	</div>
</body>
</html>