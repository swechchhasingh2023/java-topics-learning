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
<iframe width="560" height="315" src="https://www.youtube.com/embed/k7od1cg1jlQ?si=OsdiPATwY5hbVu8P" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>