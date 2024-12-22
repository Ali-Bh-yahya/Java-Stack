<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/burger/${burger.getId()}" method="post" modelAttribute="burger">
		<p>
			<form:label path="burgerName">Burger Name:</form:label>
			<form:input path="burgerName" />
			<form:errors path="burgerName" />
		</p>
		<p>
			<form:label path="restaurantName">restaurant Name:</form:label>
			<form:input path="restaurantName" />
			<form:errors path="restaurantName" />
		</p>
		<p>
			<form:label path="rate">Rating (out of 5):</form:label>
			<form:errors path="rate" />
			<form:input type="number" path="rate" />
		</p>
		<p>
			<form:label path="note">note:</form:label>
			<form:textarea path="note" />
			<form:errors path="note" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>