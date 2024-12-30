<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login & Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8 main-container">
            <h1 class="text-center header-text">Welcome!</h1>
            <p class="text-center sub-header">Join our growing community.</p>
            <div class="row mt-4">
                <!-- Register Section -->
                <div class="col-md-6">
                    <h4 class="text-center">Register</h4>
                    <form:form action="/register" method="post" modelAttribute="userReg">
                        <div class="mb-3">
                            <form:label path="userName" cssClass="form-label" for="userName">Username:</form:label>
                            <form:input path="userName" id="userName" class="form-control" placeholder="Enter your Username" />
                            <form:errors path="userName" cssClass="error-message" />
                        </div>
                        <div class="mb-3">
                            <form:label path="email" cssClass="form-label" for="registerEmail">Email:</form:label>
                            <form:input path="email" id="registerEmail" class="form-control" placeholder="Enter your Email" />
                            <form:errors path="email" cssClass="error-message" />
                        </div>
                        <div class="mb-3">
                            <form:label path="password" cssClass="form-label" for="registerPassword">Password:</form:label>
                            <form:input path="password" id="registerPassword" type="password" class="form-control" placeholder="Enter your Password" />
                            <form:errors path="password" cssClass="error-message" />
                        </div>
                        <div class="mb-3">
                            <form:label path="confirmPassword" cssClass="form-label" for="confirmPassword">Confirm Password:</form:label>
                            <form:input path="confirmPassword" id="confirmPassword" type="password" class="form-control" placeholder="Confirm your Password" />
                            <form:errors path="confirmPassword" cssClass="error-message" />
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </form:form>
                </div>
                <!-- Login Section -->
                <div class="col-md-6">
                    <h4 class="text-center">Log in</h4>
                    <form:form action="/login" method="post" modelAttribute="userLog">
                        <div class="mb-3">
                            <form:label path="email" cssClass="form-label" for="loginEmail">Email:</form:label>
                            <form:input path="email" id="loginEmail" class="form-control" placeholder="Enter your Email" />
                            <form:errors path="email" cssClass="error-message" />
                        </div>
                        <div class="mb-3">
                            <form:label path="password" cssClass="form-label" for="loginPassword">Password:</form:label>
                            <form:input path="password" id="loginPassword" type="password" class="form-control" placeholder="Enter your Password" />
                            <form:errors path="password" cssClass="error-message" />
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/script.js"></script>
</body>
</html>
