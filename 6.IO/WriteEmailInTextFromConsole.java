package com.raystech.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteEmailInTextFromConsole {

	public static boolean isEmail(String s) {

		String email = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,5})$";

		return s.matches(email);
	}

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("D:/C Data/hukumchand_pal.txt");

		InputStreamReader i = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(i);
		String s = br.readLine();

		while (!s.equals("exit")) {

			if (isEmail(s)) {

				pw.println(s);
				
				
			}
			s = br.readLine();
		}

		//pw.flush();
		pw.close();
		i.close();
		br.close();
		
	}
}
