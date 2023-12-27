<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project</title>
</head>
<body>
<h1 align="center"> Updated Project ${id} </h1>
<br>
	<div align="center">

		<table border=1>
			<thead>
				<tr>
					<td>Project Reporter </td>
					<td>Project Status</td>
					<td>Project Level</td>
					<td>Project Priority</td>
				</tr>
			</thead>

			
			
				<tr>
					<td>${p.reporter }</td>
					<td>${p.status }</td>
					<td>${p.level }</td>
					<td>${p.priority }</td>
					
				</tr>
			
	
		</table>
		<br>
		<a href="/Jiro/admin/home"><button>Back to home</button></a>
	</div>
</body>
</html>