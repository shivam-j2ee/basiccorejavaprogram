package trial.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
//TCP EchoServer....
	public static void main(String[] args) throws IOException {
		
		ServerSocket server=new ServerSocket(4444);
		System.out.println("server started");
		Socket client=null;
		
		while(true) {
			client=server.accept();
			talk(client);
		}
	}
	 static void talk(Socket client) throws IOException {
		PrintWriter pw=new PrintWriter(client.getOutputStream(),true);
		
		InputStreamReader ir=new InputStreamReader(client.getInputStream());
		BufferedReader br=new BufferedReader(ir);
		
		String line=br.readLine();
		
		while(!line.equals("exit")) {
		pw.println(line);
		line=br.readLine();
		}
		
		pw.close();
		br.close();
		client.close();
		
	}
	
}
