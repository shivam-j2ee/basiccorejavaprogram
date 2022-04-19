package in.co.rays.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EmailExm {
	
	public static boolean isEmail(String s) {
		
		String email = "^[A-Z0-9]+@[A-Z0-9.-]+\\.[A-Z]{2,}$";
		
		return s.matches(email);
	}

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("F:/iO_FILES/g.txt");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		
		while(s!=null) {
			
			if(isEmail(s)) {
				pw.println(s);
				s = br.readLine();
			}
		}
		
		pw.flush();
		pw.close();
		br.close();
		System.out.println("done");
	}
}
