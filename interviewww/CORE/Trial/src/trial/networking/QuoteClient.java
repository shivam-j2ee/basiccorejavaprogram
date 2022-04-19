package trial.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class QuoteClient {
	
	//QuoteClient and MultithreadedQuoteClient are same...
public static void main(String[] args) throws IOException {
	DatagramSocket socket=new DatagramSocket();
	byte[] buf=new byte[256];
	
	InetAddress address=InetAddress.getByName("127.0.0.1");
	DatagramPacket packet=new DatagramPacket(buf, buf.length,address,4444);
	
	socket.send(packet);
	
	String s=new String(packet.getData());
	
	System.out.println("name" +s);
	socket.close();
	
}
	
}
