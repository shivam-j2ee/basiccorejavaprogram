package in.co.rays.io;

import java.io.File;

public class FileDirectoryLKa {
	public static void main(String[] args) {
		File f=new File("F:/iO_FILES");
		String[] s=f.list();
		for (String string : s) {
			System.out.println(string);
			
		}
	}

}
