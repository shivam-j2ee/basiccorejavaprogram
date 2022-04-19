package com.raystech.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) throws Exception {

		URL u = new URL("http://www.sunrays.co.in:80/Home");
		
		System.out.println("Protocol : " + u.getProtocol());
		System.out.println("Host Name : " + u.getHost());
		System.out.println("Port Number : " + u.getPort());
		System.out.println("File Name : " + u.getFile());
		System.out.println("Path Name : " + u.getPath());
		
		InputStream i = u.openStream();
		Scanner sc = new Scanner(i);
		while(sc.hasNext()){
			
			String s = sc.nextLine();
			System.out.println(s);
			
		}
		sc.close();
	}

}
