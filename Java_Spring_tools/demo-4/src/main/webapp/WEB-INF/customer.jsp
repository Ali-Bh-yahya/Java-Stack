<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>name</th>
				<th>Address Street</th>
				<th>Address State</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${customers}">
				<tr>
					<td><a href="/customer/${c.id}">${c.id}</a></td>
					<td>${c.name}</td>
					<td>${c.address.streetName}</td>
					<td>${c.address.stateName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>



</body>
</html>