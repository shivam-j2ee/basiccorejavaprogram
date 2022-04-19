package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws IOException {

		Socket client = new Socket("127.0.0.1", 1213);
		
		PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
		BufferedReader b = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
	
		//System.out.println(b.readLine());
		
		String s = bb.readLine();
		while(s!=null){
			pw.println(s);
			System.out.println("Echo : " + b.readLine());
			
			if(s.equals("Bye")){
				
				break;
			}
			s = bb.readLine();
		}

	      bb.close();
	      b.close();
	      pw.close();
	      client.close();
	
	}

}
