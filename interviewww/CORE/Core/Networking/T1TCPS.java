package com.raystech.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class T1TCPS {

	public static void main(String[] args)throws IOException {

		ServerSocket server = new ServerSocket(5554);
		Socket client = server.accept();
		
		DataInputStream d = new DataInputStream(client.getInputStream());
		DataOutputStream dd = new DataOutputStream(client.getOutputStream());
		
		String s = d.readLine();
		System.out.println("Read data from Client : " + s);
		
			System.out.println(" Server Response to Client ");
			dd.writeBytes("Hello Client \n ");
			
		client.close();
		server.close();
		
	}

}
