package com.raystech.Networking;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class T1URLWriter {

	public static void main(String[] args)throws Exception{

		URL url = new URL("http://www.ask.com/web");
		
		String s ="java";
		
		URLConnection con = url.openConnection();
		con.setDoOutput(true);
		
		OutputStreamWriter o = new OutputStreamWriter(con.getOutputStream());
		
		o.write("q = " + s);
		o.close();
		
		con.connect();
		InputStream i = con.getInputStream();
		Scanner sc = new Scanner(i);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
			
		}
		i.close();
	}

}
