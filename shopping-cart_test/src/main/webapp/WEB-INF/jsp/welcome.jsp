<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<form action="authenticate" method="post">
			<table>
				<tr>
					<td>Username</td>
					<td><input type="text" placeholder="username" name="username"></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><input type="password" placeholder="password"
						name="password"></td>
				</tr>
				<tr >
					<td rowspan="1"><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>