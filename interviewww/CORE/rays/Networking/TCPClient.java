package in.co.rays.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.rmi.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("127.0.0.1", 1234);
		DataInputStream in = new DataInputStream(client.getInputStream());
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		System.out.println(in.readUTF());
		out.writeUTF("Hello Server\n");
		out.writeUTF("this is client");
		out.close();
		client.close();
		
	}
}
