package in.co.rays.exception;

import java.text.ParseException;

public class FinallyNotExecute {
	public static void main(String[] args) {
		 
		
		
		try {
			
			int a =10;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
			System.exit(1);
		} catch (ArithmeticException e) {
             e. printStackTrace();
             
		}
	finally{
		System.out.println("this is finally");
	}
	}
}
