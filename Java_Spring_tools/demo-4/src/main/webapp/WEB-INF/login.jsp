<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<form:form action="/userlogin" method="post" modelAttribute="studentLogin">
<form:label path="username">Username:</form:label>
<form:input path="username" />
<form:errors path="username"/>

<form:label path="password">Password:</form:label>
<form:input path="password" type="password"/>
<form:errors path="password"/>

<input type="submit" value="Apply" />
</form:form>

<a href="/" > Back</a>

</body>
</html>