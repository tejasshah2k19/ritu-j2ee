<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="user" class="com.bean.UserBean">
	</jsp:useBean>

	<%-- <jsp:setProperty property="firstName" name="user" />
 --%>

	<jsp:setProperty property="*" name="user" />
	FirstName :
	<jsp:getProperty property="firstName" name="user" /><Br>
	<br> Email :
	<jsp:getProperty property="email" name="user" /><br>
	<br> Password :
	<jsp:getProperty property="password" name="user" />

</body>
</html>