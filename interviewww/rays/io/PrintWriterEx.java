 package in.co.rays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterEx {
	
		public static void main(String[] args) throws Exception {
			
			FileWriter writer1 = new FileWriter("F:/iO_FILES/ajay.txt");
			
			PrintWriter pw = new PrintWriter(writer1,true);
			
			pw.println("kjgiu");
			pw.println("ajgss");
			pw.print(45);
			pw.println("4544");
			
		}

}