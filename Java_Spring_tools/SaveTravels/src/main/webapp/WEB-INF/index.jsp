<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Save Travel</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-5">
		<h2 class="mb-4">Expenses List</h2>

		<table class="table table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>Name Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="expense" items="${expenses}">
					<tr>
						<td>${expense.nameExpense}</td>
						<td>${expense.vendor}</td>
						<td>${expense.amount}</td>
						<td><a href="/expenses/edit/${expense.id}"
							class="btn btn-warning btn-sm">Edit</a>
							<form action="/expenses/delete/${expense.id}" method="post"
								style="display: inline;">

								<input type="submit" value="Delete"
									class="btn btn-danger btn-sm">
							</form></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<h3 class="mt-5">Add New Expense</h3>

		<form:form action="/expenses" method="post" modelAttribute="expense">
			<div class="form-group">
				<form:label path="nameExpense" class="form-label">Expense Name:</form:label>
				<form:input path="nameExpense" class="form-control" />
				<form:errors path="nameExpense" class="text-danger" />
			</div>

			<div class="form-group">
				<form:label path="vendor" class="form-label">Vendor:</form:label>
				<form:input path="vendor" class="form-control" />
				<form:errors path="vendor" class="text-danger" />
			</div>

			<div class="form-group">
				<form:label path="amount" class="form-label">Amount:</form:label>
				<form:input path="amount" class="form-control" />
				<form:errors path="amount" class="text-danger" />
			</div>

			<div class="form-group">
				<form:label path="description" class="form-label">Description:</form:label>
				<form:textarea path="description" class="form-control"></form:textarea>
				<form:errors path="description" class="text-danger" />
			</div>

			<button type="submit" class="btn btn-primary">Add Expense</button>
		</form:form>
	</div>


	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
