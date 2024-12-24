<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${student.username}</title>
</head>
<body>
<h1>Details:</h1>
	<ul>
	<li>Username:${student.username}</li>
	<li>Address:${student.address}</li>
	<li>Phone number:${student.phonenumber}</li>
	<li>Email:${student.email}</li>
	<li>Password:${student.password}</li>
	<li>Book Title:${student.book.title}</li>
	<li>Book Description:${student.book.description}</li>
	</ul>
	
	
</body>
</html>