package in.co.rays.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MyMultiCastServer {

public static void main(String[] args) throws IOException {
		
		DatagramSocket socket=new DatagramSocket(4446);
		
		InetAddress address=InetAddress.getByName("202.0.202.0");
		
		int port=3336;

		byte[] msg="shubham".getBytes();
		
		DatagramPacket packet=new DatagramPacket(msg,msg.length,address,port);
		
		socket.send(packet);
		socket.close();
		
	}
	
}