<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Ninja</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center mb-4">Add Ninja</h1>
        <form:form action="/ninjas" method="post" modelAttribute="ninja" class="bg-white p-4 rounded shadow">
            <div class="mb-3">
                <form:label path="firstName" class="form-label">First Name:</form:label>
                <form:input path="firstName" class="form-control" />
                <form:errors path="firstName" class="text-danger" />
            </div>
            <div class="mb-3">
                <form:label path="lastName" class="form-label">Last Name:</form:label>
                <form:input path="lastName" class="form-control" />
                <form:errors path="lastName" class="text-danger" />
            </div>
            <div class="mb-3">
                <form:label path="dojo" class="form-label">Select Dojo:</form:label>
                <form:select path="dojo" class="form-select">
                    <c:forEach var="dojo" items="${dojos}">
                        <form:option value="${dojo.id}">${dojo.dojoName}</form:option>
                    </c:forEach>
                </form:select>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>
</body>
</html>
