package com.raystech.core.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class EmailCheck {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("F:/IOExample/keyboard.txt");
	String emailRegex="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	//BufferedWriter bw = new BufferedWriter(new FileWriter("F:/IOExample/keyboard1.txt") );
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while (line!=null) {
			StringTokenizer st=new StringTokenizer(line,",");
			while(st.hasMoreTokens()) {
				String email=st.nextToken();
				if (email.matches(emailRegex)) {
					System.out.println("Email valid:"+email);					
	
					//bw.write(email);
				    
				}else {
					System.out.println("Invalid Email:"+email);
				}
				line=br.readLine();
			}
			}	
	//bw.close(); br.close();
	}
}