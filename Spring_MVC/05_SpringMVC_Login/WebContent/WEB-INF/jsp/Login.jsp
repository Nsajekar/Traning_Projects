<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h2>User Login</h2>
	<hr>
	<form action="validateuser">
		<table>

			<tr>
				<td>Login Id</td>
				<td><input type="text" name="userName"></td>
			</tr>

			<tr>

				<td>Password</td>
				<td><input type="password" name="userPassword"></td>
			</tr>

			<tr>

				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Login"></td>

			</tr>

		</table>

	</form>
</body>
</html>