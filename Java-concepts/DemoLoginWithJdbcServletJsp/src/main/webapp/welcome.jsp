<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no=cache, no-store, must-revalidate"); //Http 1.1
	response.setHeader("Pragma", "no-cache"); // older version http 1.0
	response.setHeader("Expire","0"); // proxies server
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome ${username}
	<a href="video.jsp">videos are here</a>
	<form action="Logout">
	<input type="submit" value="logout">
	</form>
</body>
</html>