
// why we need JSP
package com.servletpractice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		PrintWriter out = res.getWriter();
//		out.println("<html><body bgcolor='red'>");
		out.print("result: "+k);
//		out.print("</body></html>");
		
		try {
			int x = 9/0;
		}catch(Exception e) {
			System.out.println("Error e"+e.getMessage());
		}
	}
}

