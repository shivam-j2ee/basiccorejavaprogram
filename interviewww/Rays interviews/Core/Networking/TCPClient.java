package com.raystech.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	
public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		Socket client = new Socket("localhost", 1212);
		
		
		DataInputStream in= new DataInputStream(client.getInputStream());
		DataOutputStream out= new DataOutputStream(client.getOutputStream());
		
		out.writeUTF("Hello Server");
		
		System.out.println(in.readUTF());

		
		client.close();
		in.close();
		out.close();
		
		
	}


}
