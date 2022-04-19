package com.raystech.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class T1TCPC {

	public static void main(String[] args)throws IOException {

		Socket client = new Socket("localhost", 5554);
		
		DataInputStream i= new DataInputStream(client.getInputStream());
		DataOutputStream o = new DataOutputStream(client.getOutputStream());
		
		o.writeBytes("Hello Server");
		
		String s = i.readLine();
		System.out.println(s);
		
		/*o.close();
		i.close();*/
		client.close();
	}

}
