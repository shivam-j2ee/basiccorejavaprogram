package in.co.rays.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiTreadedEchoServer extends Thread {
	
	Socket s;

	public MultiTreadedEchoServer(Socket s) {

		this.s = s;
	}

	public void run() {
		try {
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			String line = br.readLine();
			while (line != null) {
				System.out.println("Server Recived"+line);
				
				pw.println(line + line);
				if(line.equals("bye"))
				{
					break;
				}
				line = br.readLine();
			}
			
			pw.close();
			br.close();
			s.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(1234);
		Socket s = null;
		boolean flag = true;
		while (flag) {
			s = server.accept();
			MultiTreadedEchoServer m = new MultiTreadedEchoServer(s);
			m.start();
		}

	}

}