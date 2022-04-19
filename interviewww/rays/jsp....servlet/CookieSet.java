package com.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="CookieSet",urlPatterns={"/cookie"})
public class CookieSet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String name=request.getParameter("name");
	String value=request.getParameter("value");
	Cookie c=new Cookie(name, value);
	c.setMaxAge(6*24*60*60);
	response.addCookie(c);
	}

}
