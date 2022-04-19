package in.co.rays.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(12345);
		
		Socket client = server.accept();
		
		DataInputStream in = new DataInputStream(client.getInputStream());
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		out.writeUTF("Hello Client/n");
		System.out.println(in.readUTF());
		
		client.close();
		server.close();
	}

}
