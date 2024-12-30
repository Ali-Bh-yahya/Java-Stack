<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Category</title>
</head>
<body>
	<a href ="/">Home</a>
	<h1>Add new Category</h1>
	<form:form method="post" action = "/category" modelAttribute="category">
		<label>category Name:</label>
		<form:input path = "name" />
		<form:errors path = "name"/>
	 <button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
</body>
</html>