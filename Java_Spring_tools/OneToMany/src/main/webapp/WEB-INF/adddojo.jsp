<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Dojo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center mb-4">Add Dojo</h1>
        <form:form action="/dojo" method="post" modelAttribute="dojo" class="bg-white p-4 rounded shadow">
            <div class="mb-3">
                <form:label path="dojoName" class="form-label">Dojo Name:</form:label>
                <form:input path="dojoName" class="form-control" />
                <form:errors path="dojoName" class="text-danger" />
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>
</body>
</html>