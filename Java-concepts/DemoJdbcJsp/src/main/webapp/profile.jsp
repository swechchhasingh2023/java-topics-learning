<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
101 <br>
Swechchha <br>
88 <br>
<br>
<%
	Class.forName("org.postgresql.Driver");
	String url = "jdbc:postgresql://localhost:5432/Authenticate";
	String username = "postgres";
	String password = "abc123";
	Connection con = DriverManager.getConnection(url, username, password);
	String sql = "select * from students where rollno=103";
	Statement st= con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	
	
	%>
		RollNo : <%=rs.getString(1) %> <br>
		Name : <%=rs.getString(2) %> <br>
		Marks : <%=rs.getString(3) %> 
	<%
	    rs.close();
	    st.close();
	    con.close();
	%>
</body>
</html>