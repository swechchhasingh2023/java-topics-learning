//package com.loginjdbc;
//
//import java.io.IOException;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//@WebServlet("/Login")
//public class Login extends HttpServlet {
//       
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String uname = request.getParameter("uname");
//		String pass = request.getParameter("pass");
//		if(uname.equals("swe")&& pass.equals("123")) {
//			HttpSession session = request.getSession();
//			session.setAttribute("username", uname);
//			response.sendRedirect("welcome.jsp");
//		}else {
//			response.sendRedirect("login.jsp");
//		}
//	}
//}

package com.loginjdbc;

import java.io.IOException;

import com.loginjdbc.dao.LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		LoginDao dao = new LoginDao();
		if(dao.check(uname, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}
}
