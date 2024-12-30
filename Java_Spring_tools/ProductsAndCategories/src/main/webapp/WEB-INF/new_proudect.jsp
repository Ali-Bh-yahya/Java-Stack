<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add Product</title>
</head>
<body>
	<h1>Add Product</h1>
	<form:form method = "post" acction = "/proudect" modelAttribute="proudect">
		<label>Name</label>
		<form:input path="name"/>
		<form:errors path = "name"/>
		
		<label>Description</label>
		<form:textarea path="description"/>	
		<form:errors path = "description"/>
		
		<label>Price</label>
		<form:input path="price"/>	
		<form:errors path = "price"/>
		
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
</body>
</html>