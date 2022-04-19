package com.raystech.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MultiThreadedQuoteClient {

	public static void main(String[] args) throws IOException {

		DatagramSocket socket = new DatagramSocket();
		byte[] buff = new byte[256];
		InetAddress address = InetAddress.getByName("127.0.0.1");
		
	    DatagramPacket packet = new DatagramPacket(buff, buff.length,address,4454);
	    socket.send(packet);
	    
	    packet = new DatagramPacket(buff, buff.length);
	    socket.receive(packet);
	    String s = new String(packet.getData());
	    
	    System.out.println("Quote of the Moment " + s);
	    
	    socket.close();
		
		
	}

}
