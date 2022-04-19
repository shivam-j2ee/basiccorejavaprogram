package com.ctl;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/servletContext"})
public class ServletContext1 extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response){
		ServletContext con=getServletContext();
		String a= con.getInitParameter("aj");
		System.out.println(a);
	}

}
