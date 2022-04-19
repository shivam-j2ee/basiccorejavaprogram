package com.ctl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = "/upload")
@MultipartConfig(location = "G:/aman", fileSizeThreshold = 1024 * 1024, maxFileSize = 5 * 1024
		* 1024, maxRequestSize = 2 * 1024 * 1024)
public class ErrorHandler extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Collection<Part>parts=request.getParts();
		System.out.println("no of parts"+ parts.size());
		for(Part part:parts){
			info(part,out);
			String fileName=getName(part);
			if(fileName!=null){
				part.write(fileName);
			}
			
		}
		out.close();
	}
	public void info(Part part,PrintWriter out){
		out.println("name: "+part.getName());
		out.println("size"+part.getSize());
		out.println("conte"+part.getContentType());
		Collection<String> h=part.getHeaderNames();
		for(String header:h){
			out.println("header "+part.getHeader(header));
		}
	}
	
public String getName(Part part){
	for(String token :part.getHeader("Content-disposition").split(";")){
		if(token.trim().startsWith("fileName")){
			return token.substring(token.indexOf("=")+1).trim().replace("/", "");
		}
		

	}
	return null;
}
}
