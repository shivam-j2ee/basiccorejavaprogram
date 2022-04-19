package in.co.rays.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
	
public class Echo_Server {
	
	public static void talk(Socket cSocket) throws IOException {
		
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);
		
		BufferedReader in  = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
		String line = in.readLine();
		
		while(line!=null) {
			System.out.println("Server Received: "+line);
			out.println(line+"..."+line);
			
			if(line.equals("bye")) {		
				break;
			}
			line = in.readLine();
		}
		out.close();
		in.close();
		cSocket.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(1234);
		Socket s = null;
		
		while(true) {
			s = server.accept();
			talk(s);
		}
		
	}

}


