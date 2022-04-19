package in.co.rays.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
 
public class MyMulticlient {

public static void main(String[] args) throws IOException {
		
		MulticastSocket s=new MulticastSocket(3336);
		InetAddress add=InetAddress.getByName("202.0.202.0");
		s.joinGroup(add);
		byte buf[]=new byte[256];
		DatagramPacket pkt=new DatagramPacket(buf, buf.length);
		s.receive(pkt);
		String rec = new String(pkt.getData());
		s.leaveGroup(add);
		s.close();
	}
	
}