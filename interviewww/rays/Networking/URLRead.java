package in.co.rays.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLRead {
	
	public static void main(String[] args) throws IOException {
		
		URL u = new URL("http://www.javatpoint.com");	
		System.out.println("Protocol : "+u.getProtocol());
		System.out.println("Port No : "+u.getPort());
		System.out.println("Path : "+u.getPath());
		
		InputStream io = u.openStream();
		Scanner sc = new Scanner(io);
		
		while(sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
		io.close();
		
	}

}
