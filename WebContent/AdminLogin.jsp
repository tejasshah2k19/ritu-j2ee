<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<form action="AdminLoginServlet" method="post">
		Email : <input type="text" name="email"/><br><Br>
		Password : <input type="password" name="password"/><br><br>
		<input type="submit" value="Login"/>
	</form>

</body>
</html>