<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Team</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="bg-light">
	<div class="container mt-5">
		<h1 class="text-center mb-4">Add Book</h1>
		<form:form action="/new" method="post" modelAttribute="team" class="bg-white p-4 rounded shadow">
			<div class="mb-3">
				<form:label path="teamName" class="form-label">team Name:</form:label>
				<form:input path="teamName" class="form-control" />
				<form:errors path="teamName" class="text-danger" />
			</div>
			
			<div class="mb-3">
				<form:label path="skillLevel" class="form-label">skillLevel:</form:label>
				<form:input path="skillLevel" type="number"  class="form-control" />
				<form:errors path="skillLevel" class="text-danger" />
			</div>

			<div class="mb-3">
				<form:label path="gameDay" class="form-label">Game Day:</form:label>
				<form:textarea path="gameDay" class="form-control" />
				<form:errors path="gameDay" class="text-danger" />
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
		
		<a href ="/home"><button class="btn btn-primary">Home</button></a>	
		
	</div>
</body>
</html>
