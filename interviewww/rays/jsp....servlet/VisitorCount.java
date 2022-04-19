package com.ctl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "visitorCount", urlPatterns = { "/visitor" })
public class VisitorCount extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext cst=getServletContext();
		Integer count =(Integer)cst.getAttribute("VisitorCount");
		if(count==null){
			count=1;
		}
		else{
			count++;
		}
		cst.setAttribute("visitorCount",count);
		PrintWriter out=resp.getWriter();
		
	}

}
