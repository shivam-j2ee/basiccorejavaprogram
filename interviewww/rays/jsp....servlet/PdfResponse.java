package com.ctl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletOutputStream;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="PdfResponse",urlPatterns={"/Pdf"})
public class PdfResponse extends HttpServlet{
	
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException{
		String filePath="C:/Users/Aman/desktop/aman.pdf";
		File f= new File(filePath);
		FileInputStream in=new FileInputStream(f);
		response.setContentType("application/pdf");
		response.setContentLength((int)f.length());
		ServletOutputStream out=response.getOutputStream();
		byte[] buff=new byte[512];
		int line=in.read(buff);
		while(line>0){
			out.write(buff,0,line);
			line=in.read(buff);
		}
		out.close();
		in.close();
	}

}
