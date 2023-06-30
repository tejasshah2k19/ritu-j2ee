<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int x = 10;
	%>

	<c:set var="x" value="50"></c:set>
	<c:out value="${x}"></c:out>
	<c:remove var="x" />
	<br>
	<br>
	<c:set var="age" value="50"></c:set>

	<c:if test="${age >30 }">
	You are Old
</c:if>

	<c:if test="${age < 30 }">
	You are Younger
</c:if>

	<br>
	<Br>

	<c:choose>
		<c:when test="${age == 10 }">
		10
	</c:when>
		<c:when test="${age == 20 }">
		20
	</c:when>
		<c:otherwise>
		Invalid Age
	</c:otherwise>
	</c:choose>


	<c:catch var="e">
	Something Went Wrong
</c:catch>

	<%-- <c:redirect url="http://www.google.com"></c:redirect>
 --%>

	<br>
	<c:forTokens items="1,2,3,4,5" delims="," var="p">
	${p }<br>
	</c:forTokens>
	
	

</body>



</html>