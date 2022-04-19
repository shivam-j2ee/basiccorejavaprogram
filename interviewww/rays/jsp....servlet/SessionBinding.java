package com.ctl.servlet;

import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
@WebServlet(name="session",urlPatterns="/Session")
public class SessionBinding implements HttpSessionBindingListener {

	public void valueBound(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		SessionBinding session=(SessionBinding) e.getValue();
		Date d=new Date();
		System.out.println("login time"+d);
		
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		SessionBinding session=(SessionBinding) event.getValue();
		Date d=new Date();
		System.out.println("login time"+d);
		
	}

}
