<%@page import="com.service.MailerService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Something Went Wrong Please Try After Sometime...</h2>

<br>
<%=exception
%>

<br><br>
<%=exception.getMessage() %>


<%
	new MailerService().sendMailForError("tejasshah2k19@gmail.com", exception);
%>
</body>
</html>