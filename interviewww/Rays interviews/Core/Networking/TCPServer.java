package com.raystech.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(1212);

		Socket client = server.accept();
System.out.println("stareted");
		DataInputStream in = new DataInputStream(client.getInputStream());

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		String greeting = in.readUTF();

		System.out.println(greeting);

		out.writeBytes("Hello Client/n");

		server.close();
		client.close();

	}

}
