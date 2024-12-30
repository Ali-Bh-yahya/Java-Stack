<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create New Team</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <a href="/" class="btn btn-secondary mb-3">Dashboard</a>
        <h1>Create New Team</h1>
        <form:form method="post" action="/teams/new" modelAttribute="team" class="mt-4">
            <form:hidden path="id"/>
            
  
            <div class="mb-3">
                <label for="name" class="form-label">Team Name</label>
                <form:input path="name" id="name" class="form-control" placeholder="Enter team name" />
                <form:errors path="name" class="text-danger" />
            </div>

          
            <div class="mb-3">
                <label for="skill" class="form-label">Skill Level (1-5)</label>
                <form:input path="skill" id="skill" type="number" min="1" max="5" step="1" class="form-control" placeholder="Enter skill level" />
                <form:errors path="skill" class="text-danger" />
            </div>

  
            <div class="mb-3">
                <label for="gameDay" class="form-label">Game Day</label>
                <form:input path="gameDay" id="gameDay" class="form-control" placeholder="Enter game day" />
                <form:errors path="gameDay" class="text-danger" />
            </div>

    
            <button type="submit" class="btn btn-primary">Create Team</button>
        </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
