<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
body {
    background-image:
url("https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn-production-thumbor-vidio.akamaized.net%2FXHonJC2HJNIKzVYXkTAWjK3dRaI%3D%2F640x360%2Ffilters%3Aquality(90)%2Fvidio-web-prod-video%2Fuploads%2Fvideo%2Fimage%2F1318193%2Fmajnu-bhai-painting-in-the-middle-of-the-street-comedy-scene-welcome-hindi-film-hd-76d5fa.jpg&imgrefurl=https%3A%2F%2Fwww.vidio.com%2Fwatch%2F1318193-majnu-bhai-painting-in-the-middle-of-the-street-comedy-scene-welcome-hindi-film-hd&tbnid=Kv99z-X43aNuaM&vet=12ahUKEwjO-MO8nIr7AhUj4TgGHVuGAGsQMygDegUIARDOAQ..i&docid=EGEQLur7ryFElM&w=640&h=360&q=majnu%20bhai%20welcome&ved=2ahUKEwjO-MO8nIr7AhUj4TgGHVuGAGsQMygDegUIARDOAQ");
    background-size: 100% 369%;
}
</style>
</head>
<center>
<body>
	<h2>User Login</h2>
	<hr>
	<form action="validateuser" method="get">
		<table>

			<tr>
				<td>Username</td>
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
	<a href="registrationpage">Ragister New User</a>
</body>
</center>
</html>