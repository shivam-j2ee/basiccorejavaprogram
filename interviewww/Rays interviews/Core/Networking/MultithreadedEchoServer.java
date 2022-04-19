package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedEchoServer extends Thread{

	  Socket  s;
	  
	  public MultithreadedEchoServer(Socket s) {
	           this.s=s;
	  }
	
	  public void run(){
		  
		  try{
			  PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
			  BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
			  
			  String st = b.readLine();
			  while(st!=null){
				  pw.println(st+"...."+st);
				  if(st.equals("Bye")){
					  break;
					  
				  }
				  st = b.readLine();
			  }
			  
			  pw.close();
			  b.close();
			  
		  }catch(IOException e){
			  e.printStackTrace();
			  
		  }
		
	  }
	  
	
	public static void main(String[] args)throws IOException {

		ServerSocket server = new ServerSocket(4454);
		Socket s = null;
		boolean flag=true;
		while(flag){
			
			s = server.accept();
			MultithreadedEchoServer m = new MultithreadedEchoServer(s);
			
			m.start();
		}
		
		server.close();
		
	}

}
