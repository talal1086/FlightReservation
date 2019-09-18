<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<center>
		<h2>User Registration</h2>
		<form action="registerUser" method="post">
			
			First Name: <input type="text" name="firstName" />
			Last Name: <input type="text" name="lastName" />
			Email: <input type="text" name="email" />
			password: <input type="password" name="password" />
			
	
			<input type="submit" value="Register" class="btn btn-primary" />
		
		</form>
	</center>
</body>
</html>