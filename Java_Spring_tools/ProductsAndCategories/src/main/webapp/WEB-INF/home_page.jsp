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
<title>Home</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="container my-5">
		<div class="row justify-content-center">
			<div class="col-md-10">
				<table class="table table-striped table-bordered table-hover">
					<thead class="table-dark">
						<tr>
							<th>Products</th>
							<th>Price</th>
							<th>Categories</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="proudect" items="${proudects}">
							<tr>
							<td> <a href="/products/${product.id}" class="text-decoration-none text-primary">
                                ${product.name}
                           	</a></td>
				        <td>$${product.price}</td>
                        <td>${product.categories.size()}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
					<table class="table table-striped table-bordered table-hover">
					<thead class="table-dark">
						<tr>
							<th>category name</th>
							<th>products </th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="category" items="${catogories}">
							<tr>
								<td>category.name</td>
								 <td>${category.proudects.size()}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
				
				<div class="d-flex justify-content-between mt-4">
					<a href="/new/proudect" class="btn btn-success">Add New Product</a>
					<a href="/new/category" class="btn btn-success">Add New category</a>
				</div>
			</div>
		</div>
	</div>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/js/script.js"></script>
</body>
</html>
