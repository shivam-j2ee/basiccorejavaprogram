package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultithreadedEchoClient {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket("localhost",4454);

	   PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
	   BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
	   BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
	  
	   String st = bb.readLine();
	   while(st!=null){
		   pw.println(st);
		   System.out.println("Echo : " + b.readLine());
		   if(st.equals("Bye")){
			   break;
	    }
		 
		   st = bb.readLine();
	   }
	  pw.close();
	  b.close();
	  bb.close();
	}

}
