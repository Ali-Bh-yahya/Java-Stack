<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<style>
* {
	color: maroon;
}

body {
	background-color: linen;
}
</style>
<body>
	<h2>Test</h2>

	<a href="/signup"> Sign Up</a>
	<a href="/login"> Login</a>

	<h1>All Students</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Username</th>
				<th>Email Address</th>
				<th>Phone Number</th>
				<th>Password</th>
				<th>Address</th>
				<th>Created At</th>
				<th>Updated At</th>
				<th>Book title</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="student" items="${students}">
				<tr>
					<td><a href="/student/${student.id}">${student.id}</a></td>
					<td>${student.getUsername()}</td>
					<td>${student.getEmail()}</td>
					<td>${student.getPhonenumber()}</td>
					<td>${student.getPassword()}</td>
					<td>${student.getAddress()}</td>
					<td>${student.getCreatedAt()}</td>
					<td>${student.getUpdatedAt()}</td>
					<td>${student.book.title}</td>
					<td><a href="/editstudent/${student.id}">Edit</a></td>
					<td>
						<form:form action="/delete" method="post" modelAttribute="student">
							<form:hidden path="id" value="${student.id}"/>
							<input type="submit" value="delete" />
						</form:form>	
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>