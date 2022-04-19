package com.raystech.Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class T1MCS {

	public static void main(String[] args) throws Exception {

		DatagramSocket socket = new DatagramSocket(4765);
		
		InetAddress groupIP = InetAddress.getByName("202.0.202.0");
		int groupPort = 4343;
		byte[] msg = "Good Morning".getBytes();
		
		DatagramPacket packet = new DatagramPacket(msg, msg.length,groupIP,groupPort); 
		socket.send(packet);
		
		socket.close();
		
	}

}
