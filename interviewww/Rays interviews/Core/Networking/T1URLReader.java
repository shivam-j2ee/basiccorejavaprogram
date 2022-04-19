package com.raystech.Networking;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class T1URLReader {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://www.sunrays.co.in:80/Home"); 
  
		System.out.println("Protocol Name : "+ url.getProtocol());
		System.out.println("Host Name : " + url.getHost());
		System.out.println("Port Number : " + url.getPort());
		System.out.println("File Name : " + url.getFile());
		
		InputStream i = url.openStream();
		Scanner sc = new Scanner(i);
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
			
		}
		i.close();
	}

}
