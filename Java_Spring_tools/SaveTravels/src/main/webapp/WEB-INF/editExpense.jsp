<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Expense</title>

    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<button><a href = "/" class="btn btn-secondary btn-sm">back</a></button>
<div class="container mt-5">
    <h2>Edit Expense</h2>

    <form:form action="/expenses/update" method="post" modelAttribute="expense">
        <form:input path="id" type="hidden" />

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

        <button type="submit" class="btn btn-success">Update Expense</button>
    </form:form>
</div>




<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
