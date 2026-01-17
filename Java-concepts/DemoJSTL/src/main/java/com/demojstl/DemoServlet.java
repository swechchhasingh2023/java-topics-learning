//package com.demojstl;
//
//import java.io.IOException;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class DemoServlet extends HttpServlet{
//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String name ="Swechchha";
//		request.setAttribute("label", name);
//		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
//		rd.forward(request, response);
//	}
//}

//if we want to use object send to the jSTL
//package com.demojstl;
//
//import java.io.IOException;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class DemoServlet extends HttpServlet{
//	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Student s = new Student(1, "swechchchha");
//		request.setAttribute("student", s);
//		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
//		rd.forward(request, response);
//	}
//}

package com.demojstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> stud = Arrays.asList(new Student(1, "swe"), new Student(2, "abhi"),new Student(3, "ankita"));
//		if want to send all the object
		request.setAttribute("students", stud);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}
	
}

