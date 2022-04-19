package trial.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	//MultiThreaded_EchoClient and EchoClient are same....
	
public static void main(String[] args) throws UnknownHostException, IOException {
	Socket client=new Socket("127.0.0.1",4444);
	
	PrintWriter pw=new PrintWriter(client.getOutputStream(),true);
	
	InputStreamReader ir1=new InputStreamReader(client.getInputStream());
	BufferedReader br1=new BufferedReader(ir1);
	
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	
	String line=br.readLine();
	
	while(!line.equals("exit")) {
	pw.println(line);
	line=br.readLine();
	}
	
	pw.close();
	br1.close();
	br.close();
	client.close();
	
}

}
