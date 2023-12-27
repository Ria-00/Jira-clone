<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Project</title>
</head>
<body>
	<div align="center">

		<h2>Update Project ${pid}</h2>
		<br>
		<hr>
		<form:form action="updateprojectprocess" method="post" modelAttribute="project">


			<label for="reporter">Project Reporter</label>
			<form:input type="text" path="reporter" />
			<br>
			<br>
			<label for="status">Project Status</label>
			<form:select path="status">
			<form:options items='${project.statusOptions }' />
		</form:select>
			<br>
			<br>
			<label for="level">Project Level</label>
			<form:select path="level">
			<form:options items='${project.leveloptions }' />
		</form:select>
			<br>
			<br>
			<label for="priority">Project Priority</label>
			<form:select path="priority">
			<form:options items='${project.priorityoption }' />
		</form:select>
			<br>
			<br>


			<input type="submit" value="submit" />

		</form:form>
		<hr>

	</div>
</body>
</html>