package trial.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLRead {
public static void main(String[] args) throws IOException {
	
	URL u=new URL("http://www.javatpoint.com");
	
	System.out.println(u.getProtocol());
	System.out.println(u.getPort());
	System.out.println(u.getHost());
	
	InputStream io=u.openStream();
	Scanner sc=new Scanner(io);
	
	while(sc.hasNext()) {
		String s=sc.nextLine();
		System.out.println(s);
	}
	io.close();
}
}
