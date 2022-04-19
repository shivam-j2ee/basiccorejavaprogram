package trial.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Try {
public static void main(String[] args) throws IOException {
	String[] quotes= {"A","B","C"};
	DatagramSocket socket=new DatagramSocket();

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
