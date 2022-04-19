package trial.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Multithreaded_QuoteServer extends Thread {

	public static void main(String[] args) throws IOException {
		
		Multithreaded_QuoteServer m=new Multithreaded_QuoteServer();
		m.start();
	}		
		DatagramSocket socket=null;
		String[] quotes= {"A","B","C","D"};
        
		public Multithreaded_QuoteServer() throws SocketException {
			socket=new DatagramSocket(4444);
		}
	
		public void run() {
			while(true) {
		try {
		byte[] buf=new byte[256];
		
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			
			InetAddress address=packet.getAddress();
			int port=packet.getPort();
			
			int i=(int)(Math.random()*2);
			System.out.println(i);
			
			byte[] b=quotes[i].getBytes();
			
			DatagramPacket pack=new DatagramPacket(b, b.length,address,port);
			socket.send(pack);
		}catch(IOException e) {
		System.out.println(e.getMessage());	
		}	
		socket.close();

		}
	}
	

}