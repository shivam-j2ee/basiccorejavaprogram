package trial.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWrite {
	public static void main(String[] args) throws IOException {
		URL u=new URL("http://www.javatpoint.com");
		
		String s="java";
		
		URLConnection con=u.openConnection();
		con.setDoOutput(true);
		
		OutputStreamWriter o=new OutputStreamWriter(con.getOutputStream());
		o.write(s);
		o.close();
		con.connect();
		
		InputStream i=con.getInputStream();
		Scanner sc=new Scanner(i);
		
		while(sc.hasNext()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
		i.close();
	}

}
