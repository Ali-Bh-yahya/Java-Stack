<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
        <h1>Welcome, ${loggedUser.userName}!</h1>
        <a href="/logout" class="btn btn-primary">Log out</a>

        <h2 class="mt-4">Teams</h2>
        <table class="table table-striped table-bordered">
            <thead class="table-dark">
                <tr>
                    <th>Team Name</th>
                    <th>Skill Level (1-5)</th>
                    <th>Players</th>
                    <th>Game Day</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="team" items="${teams}">
                    <tr>
                        <td>
                            <a href="/teams/${team.id}" class="text-decoration-none text-primary">
                                ${team.name}
                            </a>
                        </td>
                        <td>${team.skill}</td>
                        <td>${team.players.size()}/9</td>
                        <td>${team.gameDay}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
       
        <a href="/teams/new" class="btn btn-primary">Create New Team</a>
    </div>

 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
