package com.raystech.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class T1UDPQC {

	public static void main(String[] args)throws IOException {

		DatagramSocket socket = new DatagramSocket();
		byte[] buf = new byte[256];
		
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(buf, buf.length,address,4478);
		socket.send(packet);
		
		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		String recieve = new String(packet.getData());
		System.out.println("Quote of the Moment " + recieve);
		
		socket.close();
		
	}

}
