package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class T1EC {

	public static void main(String[] args)throws IOException {

		Socket client = new Socket("127.0.0.1", 1234);
		
		PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
		BufferedReader b = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		System.out.println("Client Started");
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
	
		String s = bb.readLine();
		while(s!=null){
			
			pw.println(s);
			System.out.println("Echo : " + b.readLine());
			
			if(s.equals("bye")){
				
				break;
			}
			
			s = bb.readLine();
		}

	   pw.close();
	   b.close();
	   bb.close();
	   client.close();
	
	
	}

}
