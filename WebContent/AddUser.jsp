<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>

	<%
		String error = (String) request.getAttribute("error");
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
		
		String firstNameValue = (String) request.getAttribute("firstNameValue");
		String emailValue = (String) request.getAttribute("emailValue");
	%>

	<form action="AddUserServlet" method="post">
		FirstName : <input type="text" name="firstName"  value="<%=firstNameValue==null?"":firstNameValue%>"/>
			<%=firstNameError==null?"":firstNameError
					%>
		<br> <BR>
		Email : <input type="text" name="email" value="<%=emailValue==null?"":emailValue %>" />
		<%=emailError==null?"":emailError%>
		 <br> <BR>
		Password : <input type="text" name="password" />
		<%=passwordError==null?"":passwordError %>
		 <br> <BR>
		<input type="submit" value="Signup" />

	</form>
	<%=error == null ? "" : error%>

</body>
</html>