<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show Dojos and Ninjas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h1 class="text-center mb-4">Dojos and Ninjas</h1>
        <div class="row">
            <c:forEach var="dojo" items="${dojos}">
                <div class="col-md-6 mb-4">
                    <div class="card shadow">
                        <div class="card-body">
                            <h5 class="card-title">${dojo.dojoName}</h5>
                            <ul class="list-group list-group-flush">
                                <c:forEach var="ninja" items="${dojo.ninjas}">
                                    <li class="list-group-item">
                                        ${ninja.firstName} ${ninja.lastName}
                                    </li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
