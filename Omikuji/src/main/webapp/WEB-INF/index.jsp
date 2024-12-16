<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container my-5">
    <h1 class="text-center mb-4">Send an Omikuji!</h1>
    <form action="/omikuji" method="post" class="p-4 bg-white rounded shadow">
        <div class="mb-3">
            <label class="form-label">Pick any number from 5 to 25</label>
            <select name="number" class="form-select">
                <% for (int i = 5; i <= 25; i++) { %>
                    <option value="<%= i %>"><%= i %></option>
                <% } %>
            </select>
        </div>
        <div class="mb-3">
            <label class="form-label">Enter the name of any city</label>
            <input type="text" name="city" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Enter the name of any real name</label>
            <input type="text" name="name" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Enter professional endeavor or hobby</label>
            <input type="text" name="hobby" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Enter any type of living thing</label>
            <input type="text" name="animal" class="form-control">
        </div>
        <div class="mb-3">
            <label class="form-label">Say something nice to someone</label>
            <textarea rows="4" name="description" class="form-control"></textarea>
        </div>
        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Send</button>
        </div>
    </form>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
