package com.raystech.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastClient {

	public static void main(String[] args) throws IOException {

		MulticastSocket socket = new MulticastSocket(3336);
		InetAddress group = InetAddress.getByName("202.0.202.0");
	
		socket.joinGroup(group);
		byte[] buf = new byte[256];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		socket.receive(packet);
		String s = new String(packet.getData());
		System.out.println(s);
		
		socket.leaveGroup(group);
		socket.close();
		
	}

}
