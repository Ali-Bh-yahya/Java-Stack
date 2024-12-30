<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login & Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">

</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8 main-container">
                <h1 class="text-center header-text">Welcome, ${userLogin.userName} </h1>
                <p class="text-center sub-header">This is your dashboard. Nothing to see here yet.</p>
            </div>
            <a href="/logout" class="btn btn-primary">logout</a>
        </div>
    </div>
	<div class="container my-5">
				<div class="row justify-content-center">
					<div class="col-md-10">
						<table class="table table-striped table-bordered table-hover">
							<thead class="table-dark">
								<tr>
									<th>Team Name</th>
									<th>Skill Level(1-5)</th>
									<th>players</th>
									<th>Game Day</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="team" items="${teams}">
									<tr>
										<td><a href="/teams/${teams.id}"
											class="text-decoration-none text-primary">
												${team.teamName} </a></td>
										<td>${team.teamLead.userName}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						            </div>
            <a href="/new/team" class="btn btn-primary">Create Team</a>
        </div>

    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/script.js"></script>
</body>
</html>