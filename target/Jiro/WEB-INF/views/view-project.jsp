<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projects</title>
</head>
<body>
<h1 align="center">Projects</h1>
<br>
	<div align="center">

		<table border=1>
			<thead>
				<tr>
					<td>Project Id</td>
					<td>Project Name</td>
					<td>Project Reporter</td>
					<td>Project Status</td>
					<td>Project Level</td>
					<td>Project Priority</td>
					<td>Operation</td>
					<td>Assignes</td>
				</tr>
			</thead>

			
			<c:forEach var="p" items="${list}">
				<tr>
					<td>${p.pid }</td>
					<td>${p.name}</td>
					<td>${p.reporter }</td>
					<td>${p.status }</td>
					<td>${p.level }</td>
					<td>${p.priority }</td>
					<td><a href="updateproject?id=${p.pid}">Edit</a> <a
						href="deleteproject?id=${p.pid}"
						onclick="if (!(confirm('Do you really want to delete this project record?'))) return false">Delete</a>
					</td>
					<td><a href="manageassigne?id=${p.pid}">Manage</a> 
					</td>
				</tr>
			
		</c:forEach>
		</table>
		<br>
		<a href="/Jiro/admin/insertproject"></a>
		<br>
		<a href="/Jiro/admin/home"><button>Back to home</button></a>
	</div>
</body>
</html>