package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IDFilter
 */
@WebFilter("/addAlien")
public class IDFilter extends HttpFilter implements Filter {
   
 
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		System.out.println("In Filter");
		HttpServletRequest req= (HttpServletRequest) request;
		int aid = Integer.parseInt(request.getParameter("aid"));
		String name = request.getParameter("aname");
		if(aid>1 && name.length()>3)
			chain.doFilter(request, response);
		else
			out.print("Invalid Input");		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
