package com.raystech.Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class T2 extends Thread {

	Socket s;
	public T2(Socket s) {
             this.s=s;
	}
	
	public void run(){
		try{
			PrintWriter p = new PrintWriter(s.getOutputStream(),true);
			BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String s = b.readLine();
			while(s!=null){
				p.println(s+"...."+s);
				if(s.equals("by")){ break;}
				s = b.readLine();
			}
			p.close();
			b.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args)throws Exception {

		ServerSocket server = new ServerSocket(5545);
		Socket s = null;
		boolean flag=true;
		while(flag){
			s = server.accept();
			T2 t = new T2(s);
			t.start();
					
			
		}
		
	}

}
