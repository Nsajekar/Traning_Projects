<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<center>
	<body>
		<form action="confirmationpage"  modelAttribute="memberDetails">
			<table>
				<h1>Ragister New User</h1>
				<tr>
					<td>First name :</td>
					<td><input type="text" name="firstName"></td>
				</tr>

				<tr>

					<td>Last Name :</td>
					<td><input type="text" name="lastName"></td>
				</tr>
				<tr>
				<tr>
				<tr>
					<td>Set Username :</td>
					<td><input type="text" name="username"></td>
				</tr>

				<tr>

					<td>Set Password :</td>
					<td><input type="text" name="password"></td>
				</tr>
				<select name="roleDetails.roleName">
					<option value="admin">admin</option>
					<option value="faculty">faculty</option>
					<option value="student">student</option>
				</select>

				<tr>

					<td><input type="reset" value="Clear"></td>
					<td><input type="submit" value="Login"></td>

				</tr>
				
				

			</table>

		</form>

	</body>
</center>
</html>