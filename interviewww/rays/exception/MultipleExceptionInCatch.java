package in.co.rays.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

public class MultipleExceptionInCatch {
	
	public static void main(String[] args) {
		
		String name = "rays";
		
		try {
			
			System.out.println(name.length());
			System.out.println(name.charAt(8));
			try{}catch(RuntimeException w){}
			
		}
		catch(NoSuchElementException|StringIndexOutOfBoundsException e) {		//		child to child
			 //System.exit(-1);
			
			e.printStackTrace();
		}
		/*
		
		catch(IOException | SQLException e) {    // parent to parent
			e.printStackTrace();
		}
		*/
		finally {
			System.out.println("finally");
		}
	}
}
