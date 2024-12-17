<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/CSS/style.css">
<meta charset="UTF-8">
<title>Money Page</title>
</head>
<body>
	<div class="main_container">
    <h4>Your Gold:</h4>
    <input class="number_of_gold" type="number" name="number" value="${gold}">
    <div class="main">
      <form action="/processMoney" method="post" class="place">
        <h3>Farm</h3>
        <p>(earns 10 - 20 gold)</p>
        <input type="hidden" name="key_of_place" value="farm">
        <input type="submit" value="submit">
      </form>
      <form action="/processMoney" method="post" class="place">
        <h3>Cave</h3>
        <p>(earns 5 - 10 gold)</p>
        <input type="hidden" name="key_of_place" value="cave">
        <input type="submit" value="submit">
      </form>
      <form action="/processMoney" method="post" class="place">
        <h3>House</h3>
        <p>(earns 2 - 5 gold)</p>
        <input type="hidden" name="key_of_place" value="house">
        <input type="submit" value="submit">
      </form>
      <form action="/processMoney" method="post" class="place">
        <h3>Casino</h3>
        <p>(earns/takes 50 - 50 gold)</p>
        <input type="hidden" name="key_of_place" value="casino">
        <input type="submit" value="submit">
      </form>
    </div>
    <div class="activities">
      <c:forEach var="message" items="${messages}">
        <p>${message}</p>
      </c:forEach>
    </div>
    
</body>
</html>