package com.ctl;

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

@WebServlet(name = "FileUploadServlet", urlPatterns = { "/upload" })
@MultipartConfig(location = "G:/DTO", fileSizeThreshold = 1024 * 1024, maxFileSize = 5 * 1024 * 1024, maxRequestSize = 2
		* 1024 * 1024)
public class FileUploadServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Collection<Part>parts=request.getParts();
		out.println("no of parts"+parts.size());
		for(Part part:parts){
			info(part,out);
			String fileName=getName(part);
			if(fileName!=null){
				part.write(fileName);
			}
		}
		
	}
	
	public void info(Part part,PrintWriter out){
		out.println("name"+part.getName());
		out.println("contentType"+part.getContentType());
		out.println("size"+part.getSize());
		Collection<String>Header=part.getHeaderNames();
		for(String h:Header){
			out.println("header"+part.getHeader(h));
			
		}
		
		
	}
	public String getName(Part part){
		for(String token:part.getHeader("content decompostion").split(";")){
			if(token.trim().startsWith("fileName")){
				return token.substring(token.indexOf('=')+1).trim().replace("/", "");
			}
		}
		return null;
	}
	
}
