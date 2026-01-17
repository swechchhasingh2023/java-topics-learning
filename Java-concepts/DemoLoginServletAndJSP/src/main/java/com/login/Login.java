package com.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equals("swe")&& pass.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}


}
