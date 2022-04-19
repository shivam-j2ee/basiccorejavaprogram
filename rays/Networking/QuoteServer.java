package in.co.rays.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class QuoteServer {

	public static void main(String[] args) throws IOException {
		
	String[] quotes = {"A", "B", "C", "D"};
	
	DatagramSocket socket = new DatagramSocket(4445);
	
	byte[] buf = new byte[256];
	
	DatagramPacket packet = new DatagramPacket(buf, buf.length);
	
	while(true) {
		socket.receive(packet);
		
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		
		int ind = (int) (Math.random() * 2);
		System.out.println("Ind "+ind);
		
		byte[] byt = quotes[ind].getBytes();
		
		DatagramPacket pac = new DatagramPacket(byt, byt.length, address, port);
		socket.send(pac);
	}
	
}
}