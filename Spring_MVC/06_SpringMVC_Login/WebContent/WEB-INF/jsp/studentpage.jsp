<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<center>
<body>

	<h3>Student Details</h3>
	
	             Member Code = ${memberDetails.memberCode}
	             <hr>
	             Member Name = ${memberDetails.firstName}   ${memberDetails.lastName}
	             <hr>
	              Member Role = ${memberDetails.roleDetails.roleName}
	              <hr>
	              Member Book issue Count =  ${memberDetails.bookIssuedCount}
	              <hr> 
	             
	
			

</body>
</center>
</html>