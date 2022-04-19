package com.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="visit",urlPatterns={"/visit"})
public class VisitorCountServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	ServletContext cxtm=getServletContext();
	Integer count= (Integer) cxtm.getAttribute("Visitor");
	if(count==null){
		count=1;
	}else
		count++;
	cxtm.setAttribute("c", count);
	PrintWriter out=resp.getWriter();
	out.println("<html><body>");
	out.println("Total visitor count are:"+count);
	out.println("</body></html>");
	
}
}
