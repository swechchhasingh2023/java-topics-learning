<!-- why use JSP -->

<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<% 
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k =i+j;
		out.print("result : "+k);
	%>
</body>
</html> --%>


<!-- JSP to Servlet conversion-->
<%-- <%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body bgcolor="red">
	Hello World
	<%
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		out.println("result : "+k);
	%>
</body>
</html> --%>


<!-- JSP tags : Scriptlet, Declartion Directive Expression-->
Declaration Directive Sriptlet Expression
<%@page import="java.util.Scanner"%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body bgcolor="cyan">
	<%!
		int coef= 3;
	%>
	<%
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		out.print(k);	
	%>

	My favourite number is : <%= coef %>
</body>

</html>







