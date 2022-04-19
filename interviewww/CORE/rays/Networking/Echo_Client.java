package in.co.rays.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Echo_Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket csocket = new Socket("localhost", 1234);
		PrintWriter out = new PrintWriter(csocket.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(csocket.getInputStream()));
		
		System.out.println("client started");
		
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String line = stdIn.readLine();
		
		while(line!=null){
			out.println(line);
			System.out.println("Echo. "+ in.readLine());
			
			if(line.equals("bye")){
				break;
			}
			line = stdIn.readLine();
		}
		out.close();
		in.close();
		stdIn.close();
		csocket.close();
	}

}
