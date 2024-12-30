<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Join Us</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light text-dark">
    <div class="container py-5">
        <div class="text-center mb-5">
            <h2 class="display-6 fw-bold text-dark">Welcome to Our Community!</h2>
            <p class="text-muted">Join us or log in to start your amazing journey.</p>
        </div>

        <!-- Form Section -->
        <div class="row justify-content-center g-5">
            <!-- Registration Card -->
            <div class="col-lg-5 col-md-6">
                <div class="card border-0 shadow-sm">
                    <div class="card-header bg-primary text-white text-center">
                        <h3>Create an Account</h3>
                    </div>
                    <div class="card-body">
                        <form:form action="/register" method="post" modelAttribute="newUser">
                            <div class="mb-4">
                                <form:label path="userName" cssClass="form-label" for="registerUsername">Username:</form:label>
                                <form:input path="userName" id="registerUsername" class="form-control" placeholder="Enter your username" />
                                <form:errors path="userName" cssClass="text-danger small" />
                            </div>
                            <div class="mb-4">
                                <form:label path="email" cssClass="form-label" for="registerEmail">Email:</form:label>
                                <form:input path="email" id="registerEmail" class="form-control" placeholder="Enter your email" />
                                <form:errors path="email" cssClass="text-danger small" />
                            </div>
                            <div class="mb-4">
                                <form:label path="password" cssClass="form-label" for="registerPassword">Password:</form:label>
                                <form:input path="password" id="registerPassword" type="password" class="form-control" placeholder="Enter your password" />
                                <form:errors path="password" cssClass="text-danger small" />
                            </div>
                            <div class="mb-4">
                                <form:label path="confirm" cssClass="form-label" for="confirmPassword">Confirm Password:</form:label>
                                <form:input path="confirm" id="confirmPassword" type="password" class="form-control" placeholder="Confirm your password" />
                                <form:errors path="confirm" cssClass="text-danger small" />
                            </div>
                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">Register</button>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>

            <!-- Login Card -->
            <div class="col-lg-5 col-md-6">
                <div class="card border-0 shadow-sm">
                    <div class="card-header bg-success text-white text-center">
                        <h3>Log In</h3>
                    </div>
                    <div class="card-body">
                        <form:form action="/login" method="post" modelAttribute="newLogin">
                            <div class="mb-4">
                                <form:label path="email" cssClass="form-label" for="loginEmail">Email:</form:label>
                                <form:input path="email" id="loginEmail" class="form-control" placeholder="Enter your email" />
                                <form:errors path="email" cssClass="text-danger small" />
                            </div>
                            <div class="mb-4">
                                <form:label path="password" cssClass="form-label" for="loginPassword">Password:</form:label>
                                <form:input path="password" id="loginPassword" type="password" class="form-control" placeholder="Enter your password" />
                                <form:errors path="password" cssClass="text-danger small" />
                            </div>
                            <div class="d-grid">
                                <button type="submit" class="btn btn-success">Log In</button>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>


</html>