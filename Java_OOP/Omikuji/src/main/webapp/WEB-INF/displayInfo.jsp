<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Result</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container my-5">
    <div class="p-4 bg-white rounded shadow">
        <h1 class="text-center mb-4">Your Omikuji Fortune</h1>
        <p class="fs-5">
            In <strong>${number}</strong> years, you will live in <strong>${city}</strong> with <strong>${name}</strong> as your roommate.
        </p>
        <p class="fs-5">
            You will enjoy <strong>${hobby}</strong>. The next time you see a <strong>${animal}</strong>, you will have good luck.
        </p>
        <p class="fs-5">
            <strong>Message:</strong> ${description}
        </p>
        <div class="text-center mt-4">
            <a href="/" class="btn btn-secondary">Back to Omikuji Form</a>
        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
