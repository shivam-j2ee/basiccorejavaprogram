package com.raystech.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPQuoteServer {

	public static void main(String[] args) throws IOException {

		DatagramSocket socket = new DatagramSocket(4445);
		
		String[] quotes = {"Hukum","Ankit","Nitin"};
		
		byte[] buff = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(buff, buff.length);
		boolean flag=true;
		
		while(flag){
			socket.receive(packet);
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			
			int random = (int)(Math.random()*2);
			byte[] buf = quotes[random].getBytes();
			
			DatagramPacket newPacket = new DatagramPacket(buf, buf.length,address,port);
			socket.send(newPacket);
			
		}
		socket.close();
		
	}

}
