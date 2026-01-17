<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Statement, java.util.*" errorPage="error.jsp" %>
    
    <%@page import="java.util.ArrayList"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- pageContect -->
	<h1>Hello, <%= session.getAttribute("name") %></h1>
	
	<!-- Exception Handling in JSP create page error.jsp -->
<%-- 	<%
	try{
		int j = 9/0;
		}catch(Exception e){
		out.println("Error : "+e.getMessage());
		}
	%>  --%>
	<% int j = 9/0; %>
		
	
</body>
</html>