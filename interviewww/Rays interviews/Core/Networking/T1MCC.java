package com.raystech.Networking;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class T1MCC {

	public static void main(String[] args) throws Exception{

		MulticastSocket socket = new MulticastSocket(4343);
		InetAddress address = InetAddress.getByName("202.0.202.0");
		socket.joinGroup(address);
		byte[] buf = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		String recieve = new String(packet.getData());
		System.out.println("Message : " + recieve);
				
		socket.leaveGroup(address);
		socket.close();
	}

}
