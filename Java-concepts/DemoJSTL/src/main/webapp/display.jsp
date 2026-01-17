<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name= request.getAttribute("label").toString();
		out.print(name);
	%>
	  Label: ${label}
</body>
</html>
<!-- http://localhost:8082/DemoJSTL/add  --> --%>


<!-- JSTL: Core tags  --> 

<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>JSTL Demo</title>
</head>
<body>

  <p>Label: ${label}</p>
  <p><c:out value="Hello world" /></p>
 <!--  print attribute -->
  <c:out value="${label}" />
  <!-- Fetching website -->
  <c:import url="https://en.wikipedia.org/wiki/Website"></c:import>
<!-- http://localhost:8082/DemoJSTL/add -->
</body>
</html> --%>

<%-- <!-- JSTL: Use of Object  --> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
   <c:out value="${student.name} "/>
</body>
</html> --%>

<!-- JSTL: Use of multiple Objects  --> 
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
  <c:forEach items="${students}" var="s">
  	${s}<br>
  	${s.name}<br>
  </c:forEach>
</body>
</html> --%>

<!-- JSTL SQL Tags: connect with databases   --> 
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<body>
  <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" 
  url="jdbc:mysql://localhost:3306/mario" user="root" password="India#639232"/>
  <sql:query var="rs" dataSource="${db}"> select * from gadgets </sql:query>
  <c:forEach items="${rs.rows}" var="gadget">
  <br>
  <c:out value="${gadget.gid}"></c:out> : 
  <c:out value="${gadget.gname}"></c:out> : 
  <c:out value="${gadget.price}"></c:out>
  </c:forEach>
</body>
</html> --%>
<!-- JSTL Functional Tags--> 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix='c' %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<body>
	<c:set var="str" value="Navin Reddy is a Java Trainer" />
	<%--  Length : ${fn:length(str)} --%>
	
	 <!-- want to print value basis on the spaces--> 
	 <c:forEach items="${fn:split(str,' ')}" var="s">
	 <br>
	 ${s}
	 </c:forEach>
	 <br>
	  <!-- want to print index--> 
	 index : ${fn:indexOf(str,"is")}
	 <br>
	  <!-- contains--> 
	  <c:if test="${fn:contains(str,'Java')}">
	  Java is there...
	  </c:if>
	  <br>
	  <c:if test="${fn:endsWith(str, 'Trainer')}">
	  You are right buddy..
	  </c:if>
	   <br>
	  ${fn:toUpperCase(str)}
	  
</body>
</html>



