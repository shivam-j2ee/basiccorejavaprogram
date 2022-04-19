package trial.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class QuoteServer {

	public static void main(String[] args) throws IOException {
		String[] quotes= {"A","B","C","D"};
		
		DatagramSocket socket=new DatagramSocket(4444);
		byte[] buf=new byte[256];
		
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
		
		while(true) {
			socket.receive(packet);
			
			InetAddress address=packet.getAddress();
			int port=packet.getPort();
			
			int i=(int)(Math.random()*2);
			System.out.println(i);
			
			byte[] b=quotes[i].getBytes();
			
			DatagramPacket pack=new DatagramPacket(b, b.length,address,port);
			socket.send(pack);
			socket.close();
		}
	}
	
}
