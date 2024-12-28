<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center mb-4">Add Book</h1>
        <form:form action="/book" method="post" modelAttribute="book" class="bg-white p-4 rounded shadow">
            <div class="mb-3">
                <form:label path="title" class="form-label">title:</form:label>
                <form:input path="title" class="form-control" />
                <form:errors path="title" class="text-danger" />
            </div>
            <div class="mb-3">
                <form:label path="author" class="form-label">author:</form:label>
                <form:input path="author" class="form-control" />
                <form:errors path="author" class="text-danger" />
            </div>
            
            <div class="mb-3">
                <form:label path="description" class="form-label">description:</form:label>
                <form:textarea path="description" class="form-control" />
                <form:errors path="description" class="text-danger" />
            </div>
         
            
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>
</body>
</html>
