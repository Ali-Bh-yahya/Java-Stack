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
<title>Login & Registration</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">

</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8 main-container">
				<h1 class="text-center header-text">Welcome,
					${userLogin.userName}</h1>
				<p class="text-center sub-header">This is your dashboard.
					Nothing to see here yet.</p>
			</div>

			<h1>All Projects</h1>
			<div class="container my-5">
				<div class="row justify-content-center">
					<div class="col-md-10">
						<table class="table table-striped table-bordered table-hover">
							<thead class="table-dark">
								<tr>
									<th>Project</th>
									<th>Team Lead</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="project" items="${unJoinedProjects}">
									<tr>
										<td><a href="/projects/${project.id}"
											class="text-decoration-none text-primary">
												${project.projectName} </a></td>
										<td>${project.teamLead.userName}</td>
										<td><form action="/join/team/${project.id}" method="post">
												<button class="btn btn-primary" type="submit">join
													team</button>
											</form></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<table class="table table-striped table-bordered table-hover">
							<thead class="table-dark">
								<tr>
									<th>Project</th>
									<th>Team Lead</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="project" items="${joinedProjects}">
									<tr>
										<td><a href="/projects/${project.id}"
											class="text-decoration-none text-primary">
												${project.projectName} </a></td>
										<td>${project.teamLead.userName}</td>

										<td><c:if test="${userLogin.id != project.teamLead.id}">
												<form action="/leave/team/${project.id}" method="post">
													<button class="btn btn-primary" type="submit">Leave
														Team</button>
												</form>
											</c:if>
											<c:if test="${userLogin.id == project.teamLead.id}">
													<a href="/home"><button class="btn btn-primary" >edit team</button></a>
											</c:if>
											</td>
											

									</tr>
								</c:forEach>
							</tbody>
						</table>

						<a href="/logout" class="btn btn-primary">logout</a> <a
							href="/new/project"><button class="btn btn-primary">create
								Project</button></a>
					</div>
				</div>


				<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
				<script type="text/javascript" src="/js/script.js"></script>
</body>
</html>