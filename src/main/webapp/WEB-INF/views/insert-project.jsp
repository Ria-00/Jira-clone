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
<title>Add Project</title>
</head>
<body>
	<div align="center">

		<h2>New Project</h2>
		<br>
		<hr>
		<form:form action="insertprojectprocess" method="post" modelAttribute="project">

			<label for="pid">Project Id</label>
			<form:input type="text" path="pid" />
			<form:errors path="pid" cssClass="error"></form:errors>
			<br>
			<br>

			<label for="name">Project Name</label>
			<form:input type="text" path="name" />
			<form:errors path="name" cssClass="error"></form:errors>
			<br>
			<br>

			<label for="reporter">Project Reporter</label>
			<form:input type="text" path="reporter" />
			<form:errors path="reporter" cssClass="error"></form:errors>
			<br>
			<br>
			<label for="status">Project Status</label>
			<form:select path="status">
			<form:errors path="status" cssClass="error"></form:errors>
			<form:options items='${project.statusOptions }' />
		</form:select>
			<br>
			<br>
			<label for="level">Project Level</label>
			<form:select path="level">
			<form:errors path="level" cssClass="error"></form:errors>
			<form:options items='${project.leveloptions }' />
		</form:select>
			<br>
			<br>
			<label for="priority">Project Priority</label>
			<form:select path="priority">
			<form:errors path="priority" cssClass="error"></form:errors>
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