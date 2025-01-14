<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<form:form action="userapproved">
		<table border="1">
			<tr>
				<th>Member Code</th>
				<th>First name</th>
				<th>Last Date</th>
				<th>Role</th>
				<th>Book Issue Count</th>
				<th>Approval Status</th>
			</tr>

			<c:forEach var="memberDetails" items="${allMembers}">
				<tr>
					<td>${memberDetails.memberCode}</td>
					<td>${memberDetails.firstName}</td>
					<td>${memberDetails.lastName}</td>
					<td>${memberDetails.roleDetails.roleId}</td>
					<td>${memberDetails.bookIssuedCount}</td>
					<td>${memberDetails.approvalStatus}</td>

				</tr>

			</c:forEach>
			<tr>
			<tr>
				<table>

					<tr>
						<td>Enter Member Id to Approved</td>
						<td><input type="text" name="userName"></td>
					</tr>
					<tr>
						<center>
							<td><input type="submit" value="Approved"></td>
							<a href="http://localhost:8085/05_SpringMVC_Login/validateuser?userName=admin&userPassword=admin">Back</a>
							<center />
					</tr>
					</form:form>
</body>

</html>