<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

	<%!
		public void jspInit(){
		
		}
	%>


	<%@ include file="Header.jsp" %>
	<%=a %>
	 
	  
	<br>
	<%out.print(a); %>
	Welcome to abc.com 
	<jsp:include page="Footer.jsp"></jsp:include>
	<%//=k %>
</body>
</html>