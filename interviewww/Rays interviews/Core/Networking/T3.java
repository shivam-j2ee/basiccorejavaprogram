package com.raystech.Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class T3 extends Thread {

	public static void main(String[] args)throws Exception {

		T3 t = new T3();
		t.start();
		
	}

	  DatagramSocket socket=null;
	  boolean flag=true;
	  String[] quotes = {"By","Bye","Byeee"};
	  
	  public T3()throws Exception {
       socket = new DatagramSocket(4554);
	
	}
	
	public void run(){
		while(flag){
			try{
				byte[] buff = new byte[256];
				DatagramPacket packet = new DatagramPacket(buff,buff.length);
				socket.receive(packet);
				InetAddress address = packet.getAddress();
				int port = packet.getPort();
				int ind = (int)(Math.random()*3);
				byte[] quote = quotes[ind].getBytes();
				DatagramPacket nP = new DatagramPacket(quote, quote.length,address,port);
				socket.send(nP);
				String s = new String(nP.getData());
				System.out.println(s);
				
			}catch(Exception e){
				e.printStackTrace();
				flag=false;
			}
			
		}
		socket.close();
		
	}
	
	
}
