<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order</title>
<link rel="stylesheet" type="text/css" href="/CSS/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	<div>
		<h1>Fruit Store</h1>
		<table class="table">
			<tr>
				<th scope="col">#</th>
				<td scope="col">Name</td>
				<td scope="col">Price</td>
			</tr>

			<c:forEach var="fruite" items="${fruits}" varStatus="status">
				<tr>
					<th scope="row">${status.index + 1}</th>
					<td><c:out value="${fruite.name}" /></td>
					<td><c:out value="${fruite.price}" /></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>