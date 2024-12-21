<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reading Books</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Language</th>
				<th>Number of Pages</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${book}">
				<tr>
					<td>${book.id}</td>
					<td>${book.title}</td>
					<td>${book.description}</td>
					<td>${book.language}</td>
					<td>${book.numberOfPages}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>