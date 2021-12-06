<%@page import="com.shopping.cart.model.UserCartEntity"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.List"%>
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
	<%!public List<UserCartEntity> ls(Object obj) {
		List<UserCartEntity> prods = Collections.emptyList();
		System.out.println(obj instanceof List<?>);
		prods = (List<UserCartEntity>) obj;
		return prods;
	}

	public float totalFare(List<UserCartEntity> prods) {
		if (prods.isEmpty()) {
			return 0f;
		}
		float total = 0f;

		for (UserCartEntity uce : prods) {
			total = total + (uce.getFare() * uce.getQuantity());
		}

		return total;
	}%>
	<a href="home">HOME</a>
	<div align="center">
		<h2>Cart</h2>
		<h3>product list</h3>
		<a href="product?di=${di}">click to add product</a>
		<%
		UserCartEntity prods = (UserCartEntity) request.getAttribute("products");
		%>
		<table border="1">
			<thead>
				<tr>
					<th>no</th>
					<th>Product</th>
					<th>Quantity</th>
					<th>Total Fare</th>
				</tr>
			</thead>

			<tr>
				<td><%=1%></td>
				<td><%=prods.getProductName()%></td>
				<td><%=prods.getQuantity()%></td>
				<td><%=prods.getFare()%></td>
			</tr>

			<%-- <c:forEach items="${ products }" var="product">
				<tr>
					<td><c:out value="${ product.getQuantity() }"></c:out></td>
					<td><c:out value="${ product.getQuantity() }"></c:out></td>
					<td><c:out value="${ product.getQuantity() }"></c:out></td>
					<td><c:out value="${ product.getQuantity() }"></c:out></td>
				</tr>
			</c:forEach> --%>
		</table>
		<br> <br>
		<table>
			<tr>
				<td>Total Amount : <%=prods.getFare()%></td>
				<td><a href="payment">Click for Payment</a></td>
			</tr>
		</table>

	</div>
</body>
</html>