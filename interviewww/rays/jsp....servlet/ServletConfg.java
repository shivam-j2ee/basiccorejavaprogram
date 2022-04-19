package com.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servletConf" }, initParams = {
		@WebInitParam(name = "url", value = "com.jdbc.mysql.Driver"), @WebInitParam(name = "user", value = "root"),
		@WebInitParam(name = "password", value = "root") })
public class ServletConfg extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfg conf = (ServletConfg) getServletConfig();
		String url = conf.getInitParameter("url");
		String password = conf.getInitParameter("password");
		System.out.println(url);

	}

}
