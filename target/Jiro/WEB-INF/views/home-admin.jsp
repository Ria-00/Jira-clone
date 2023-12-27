<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<h1>WELCOME, ${name}</h1>
<a href="/Jiro/admin/updateadmin">Update Profile</a>
<br>
<br>
<a href="/Jiro/admin/viewprojects">View/Update Projects</a><br>
<br>
<a href="/Jiro/admin/insertproject">Add Project</a><br><br>
<a href="/Jiro/admin/logout">Log Out</a>

</body>
</html>