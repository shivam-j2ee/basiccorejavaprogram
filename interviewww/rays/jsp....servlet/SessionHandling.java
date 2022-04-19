package com.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns={"/session"})
public class SessionHandling  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**with the help of cookie **/
		///write//set
		Cookie c=new Cookie("name", "value");
		c.setMaxAge(4*24*60*60);
		resp.addCookie(c);
		PrintWriter out =resp.getWriter();
		out.println("Done");
		//read//
		Cookie[] cArray=req.getCookies();
		PrintWriter out1=resp.getWriter();
		for(Cookie co:cArray){
			String name=co.getName();
			String value=co.getValue();
			out1.print(name+"  "+value);
			
		}
	/*another way of tracking in hidden.jsp*/
	/*	this is Url ReWriting*/
		out.print("<a href='/catalog'>catalog</a>");
		String u=resp.encodeURL("/LoginCtl");
		out.println("<a href='"+u+"')Catalog</a");
		
	}

}
