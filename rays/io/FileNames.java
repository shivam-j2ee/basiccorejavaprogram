package in.co.rays.io;

import java.io.File;

public class FileNames {

	public static void main(String[] args) throws Exception {

		File f = new File("F:/iO_FILES/ajay.txt");
		
		f.deleteOnExit();
		/*
		File f1= new  File(f, "input");
		
		f1.mkdir();
		
		*/
		
	/*	System.out.println(f.createNewFile());*/

		/*String[] s = f.list();
		for (String str : s) {
			System.out.println(str);
		}
*/
	}

}