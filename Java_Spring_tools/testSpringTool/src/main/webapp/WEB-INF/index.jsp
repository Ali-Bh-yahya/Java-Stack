<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>a
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flash DAta Example</title>
</head>
<body>
	<h1>Flash Data Example</h1>

	<!-------- Display flash error message --------->
	<c:if test="${not empty error }">
		<p style="color: red;">
			Error:
			<c:out value="${error}" />
		</p>
	</c:if>
	
	<!-- Display flash success message -->
	<c:if test="${not empty success}">
		<p style="color: green;">Success: <c:out value="${success}" /></p>
    </c:if>
    
    <!-- Form -->
    <from action = "/process" method = "POST">
		<label for = "name">Enter your name: </label>
		<input type = "text" name = "name" id="name" />   
		<input type = "submit" value="Submit"/>   
    </from>
    	
	
	
</body>
</html>