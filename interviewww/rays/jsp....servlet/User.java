package com.ctl;

import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebServlet(name="user",urlPatterns={"/user"})
public class User implements HttpSessionBindingListener{
	
private String name=null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void valueBound(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		User user=(User) e.getValue();
		Date d=new Date();
		System.out.println("user login "+d);
		
	}

	public void valueUnbound(HttpSessionBindingEvent e) {
		// TODO Auto-generated method stub
		User user=(User) e.getValue();
		Date d=new Date();
		System.out.println("user logout"+d);
	}
	

}
