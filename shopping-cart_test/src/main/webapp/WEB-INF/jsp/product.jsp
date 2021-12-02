<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="home">HOME</a>
	<div align="center">
		<h2>Product List</h2>
		<table border="1">
			<thead>
				<tr>
					<th>Total Quatity</th>
					<th>Product Fare</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${ prodList }" var="item">
					<tr>
						<td><c:out value="${ item.getAvailableQuantity() }">Not Found</c:out></td>
						<td><c:out value="${ item.getFare() }">Not Found</c:out></td>
						<td><a href="products?id=${ item.getId() }">ADD</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>