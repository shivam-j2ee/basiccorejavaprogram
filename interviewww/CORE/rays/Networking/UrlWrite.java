package in.co.rays.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlWrite {
	
	public static void main(String[] args) throws IOException {
		
		URL u = new URL("http://www.javatpoint.com");
		
		String s = "java";
		
		URLConnection con = u.openConnection();
		con.setDoOutput(true);
		
		OutputStreamWriter o = new OutputStreamWriter(con.getOutputStream());
		o.write(s);
		o.close();
		con.connect();
		
		InputStream is = con.getInputStream();
		Scanner sc = new Scanner(is);
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		is.close();
	}

}
