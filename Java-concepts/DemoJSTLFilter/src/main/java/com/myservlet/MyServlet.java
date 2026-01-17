package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		System.out.println("In servlet");
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname= request.getParameter("aname");
		out.print("welcome "+ aname);
	}
}
