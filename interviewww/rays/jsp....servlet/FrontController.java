package com.ctl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName="frontController",urlPatterns={"/ctl/*"})
public class FrontController implements Filter{
	private static FilterConfig conf=null;

	public void init(FilterConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		HttpSession session=req.getSession(true);
		if(session.getAttribute("User")==null){
			req.setAttribute("aman", "Your session has been expired");
			RequestDispatcher rd=req.getRequestDispatcher("/LoginView.jsp");
			rd.forward(req, res);
			
		}
		else{
			chain.doFilter(req, res);
		}
	
		// TODO Auto-generated method stub
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
