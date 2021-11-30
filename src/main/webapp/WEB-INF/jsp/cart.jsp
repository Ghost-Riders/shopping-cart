<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="com.shopping.cart.model.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Cart</h3>
	<a>product list</a>
	<%!public List<Products> ls(Object obj) {
		List<Products> prods = Collections.emptyList();
		prods = (List<Products>) obj;
		return prods;
	}%>
	<%
	List<Products> prods = ls(request.getAttribute("products"));
	%>
	<table style="align-content: center;">
		<thead>
			<tr>
				<th>no</th>
				<th>Product</th>
				<th>Price</th>
			</tr>
		</thead>
		<%
		for (int i = 0; i < prods.size(); i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=prods.get(i).getProductName()%></td>
			<td><%=prods.get(i).getFare()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>