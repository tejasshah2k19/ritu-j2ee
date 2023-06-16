<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print All Cookie</title>
</head>
<body>

<%
	Cookie c[] = (Cookie[]) request.getAttribute("allCookie");
	
%>

<%for(Cookie x:c){ %>
	
		<%=x.getName() %> : <%=x.getValue() %> <br>

<%} %>

</body>
</html>