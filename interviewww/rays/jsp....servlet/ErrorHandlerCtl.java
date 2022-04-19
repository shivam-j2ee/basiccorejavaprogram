package com.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/ErrorHandler")
public class ErrorHandlerCtl extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=resp.getWriter();
	out.println("<html><body>");
	out.print("<h1> This is error page</h1>");
	out.println("</body></html>");
	out.close();
	}

}
