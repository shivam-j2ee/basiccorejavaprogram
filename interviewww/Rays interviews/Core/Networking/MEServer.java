package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MEServer extends Thread {

	Socket s;
	public MEServer(Socket s) {
       this.s = s;
	
	}
	 
	 public void run(){
			 try{
			
				 PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
				 BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
				 
				 String s = b.readLine();
				 while(s!=null){
					 
					 pw.println(s+"...."+s);
					 if(s.equals("by")){
						 break;
						 
					 }
					 s = b.readLine();
				}		 
					 pw.close();
					 b.close();
				 
			 }catch(IOException e){
				 e.printStackTrace();
				 
			 }
	 }
	
	public static void main(String[] args) throws Exception{
     boolean flag =true;
	 ServerSocket server = new ServerSocket(4454);
	  Socket s = null;
	  System.out.println("Server Started");
		while(flag){
	  s = server.accept();
			MEServer m = new MEServer(s);
	      m.start();
		}
		
		
	}

}
