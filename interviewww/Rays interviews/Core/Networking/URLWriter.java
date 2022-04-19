package com.raystech.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriter {

	public static void main(String[] args) throws IOException {

		URL u = new URL("http://www.ask.com/web");
		String question = "java";
	
		URLConnection con = u.openConnection();
	
		con.setDoOutput(true);
		OutputStreamWriter o = new OutputStreamWriter(con.getOutputStream());
		
		o.write("q= " + question);
		o.close();
		
		con.connect();
		InputStream i = con.getInputStream();
		
		Scanner sc = new Scanner(i);
		System.out.println("URL contents *** ");
		while(sc.hasNext()){
			
			System.out.println(sc.nextLine());
			
		}
		i.close();
	}

}
