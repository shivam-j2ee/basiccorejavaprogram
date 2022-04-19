package in.co.rays.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiThreadedEchoClient {

	public static void main(String[] args) throws IOException {
		
		Socket s=new Socket("localhost", 1234);
		
		PrintWriter pw=new PrintWriter(s.getOutputStream());
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader bf2=new BufferedReader(new InputStreamReader(System.in));
		
		String line =bf2.readLine();
		
		
		while(line!=null){
			
			pw.println(line);
			System.out.println("Echo... "+bf.readLine());
			
			if(line.equals("bye")){
				break;
			}
			line=bf2.readLine();
		}
		pw.flush();
		pw.close();
		bf.close();
		bf2.close();
			
	}
}