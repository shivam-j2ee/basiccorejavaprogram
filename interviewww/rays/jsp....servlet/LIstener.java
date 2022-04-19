package com.ctl;

import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebServlet(urlPatterns={"/listener"})
public class LIstener implements HttpSessionBindingListener {
	private String name=null;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}


	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		LIstener list=(LIstener)event.getValue();
		Date d=new Date();
		System.out.println("Login bound Time of user are "+d);
		
	}
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		LIstener list=(LIstener) event.getValue();
		Date d=new Date();
		System.out.println("LogOut bound Time "+d);
		
		
	}}
