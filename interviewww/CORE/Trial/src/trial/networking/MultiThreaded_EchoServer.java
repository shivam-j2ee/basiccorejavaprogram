package trial.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreaded_EchoServer extends Thread {
	
	Socket client;
	
	public MultiThreaded_EchoServer(Socket client) {
		this.client=client;
	}
	
	 public void run() {
		 try {
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
		 }catch(IOException e) {
			 System.out.println(e.getMessage());
		 }
	}
	 
	public static void main(String[] args) throws IOException {
		
		ServerSocket server=new ServerSocket(4444);
		System.out.println("server started");
		Socket client=null;
		
		while(true) {
			client=server.accept();
			MultiThreaded_EchoServer m=new MultiThreaded_EchoServer(client);
			m.start();
		}
	}
	
	
}
