package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class T1ES {

	
	public static void main(String[] args)throws IOException{

	  ServerSocket server = new ServerSocket(1234);	
		System.out.println("Server Started");
	  
	  Socket client = null;
		
		boolean flag = true;
		while(flag){
			client = server.accept();
			talk(client);
			
		}
		server.close();
		System.out.println("Server Closed");
	}

	  public static void talk(Socket client)throws IOException{
		  
		  PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
		  BufferedReader b = new BufferedReader(new InputStreamReader(client.getInputStream()));
		  
		  String s = b.readLine();
		  while(s!=null){
			  System.out.println("Server Recieved " + s);
			  pw.println(s + "....." + s);
			  if(s.equals("bye")){
				  break;				  
			  }
			  s = b.readLine();
		  }
		  b.close();
		  pw.close();
		  client.close();
		  
	  }
	
}
