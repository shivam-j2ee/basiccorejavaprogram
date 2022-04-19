package com.raystech.Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MultiThreadedQuoteServer extends Thread {

	public static void main(String[] args) throws IOException {

		MultiThreadedQuoteServer mt = new MultiThreadedQuoteServer();
		 mt.start();
		 
  }

	DatagramSocket socket=null;
	boolean flag = true;
	String[] quotes = {"By","Bye","Byeeeee"};
	
	public MultiThreadedQuoteServer() throws IOException {
          
		   socket = new DatagramSocket(4454);
	}
	
	

	public void run(){
		while(flag){
		try{
			byte[] buf = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			InetAddress address = packet.getAddress();
			int port = packet.getPort();
			int ind = (int)(Math.random()*3);
			byte[] quote = quotes[ind].getBytes();
			
			DatagramPacket quotePacket = new DatagramPacket(quote, quote.length,address,port);
			
			socket.send(quotePacket);
			
		}catch(IOException e){
			
			e.printStackTrace();
			flag=false;
		}
		
	  }	
		socket.close();
	}
	
	
}
