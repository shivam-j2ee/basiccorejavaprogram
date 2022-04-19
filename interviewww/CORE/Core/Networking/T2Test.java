package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class T2Test {

	public static void main(String[] args)throws Exception {

		Socket s = new Socket("localhost", 5545);
		
		PrintWriter p = new PrintWriter(s.getOutputStream(),true);
		BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		
		String st = bb.readLine();
		while(st!=null){
			p.println(st);
			System.out.println("Echo : " + b.readLine());
			if(st.equals("by")){break;}
			st = bb.readLine();
		}
		p.close();
		bb.close();
		b.close();
		s.close();
		
	}

}
