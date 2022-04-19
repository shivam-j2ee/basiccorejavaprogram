package com.raystech.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MulticastServer {

	public static void main(String[] args) throws IOException {

     DatagramSocket socket = new DatagramSocket(4446);
     InetAddress groupIp = InetAddress.getByName("202.0.202.0");
     int groupPort = 3336;
	 	
     byte[] msg = "Good Morning".getBytes();
     
     DatagramPacket packet = new DatagramPacket(msg, msg.length,groupIp,groupPort);
     
     socket.send(packet);
     socket.close();
     
	}

}
