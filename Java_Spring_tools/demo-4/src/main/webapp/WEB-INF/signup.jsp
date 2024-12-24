<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>
</head>
<body>

<form:form action="/usersignup" method="post" modelAttribute="studentsignup">
	<form:label path="username">User name:</form:label>
	<form:input path="username"/>
	
	<form:label path="password">password:</form:label>
	<form:input path="password"/>
	
	<form:label path="confirmPassword">Confirm password:</form:label>
	<form:input path="confirmPassword"/>
	
	<form:label path="phonenumber">phone number:</form:label>
	<form:input path="phonenumber"/>
	
	<form:label path="email">email:</form:label>
	<form:input path="email"/>
	
	<form:label path="address">address:</form:label>
	<form:input path="address"/>
	
	<input type="submit" value="Apply!" />
	
	<h3>Summary:</h3>

	<form:errors path="username"/>
	<br>
	<form:errors path="password"/>
	<br>
	<form:errors path="phonenumber"/>
	<br>
	<form:errors path="email"/>
	<br>
	<form:errors path="address"/>
</form:form>

<a href="/" > Back</a>

</body>
</html>