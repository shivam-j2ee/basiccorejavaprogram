package in.co.rays.io;

import java.io.File;

public class DisplayOnlyFiles {
public static void main(String[] args) {
	
	File directory=new File("F:/iO_FILES");
	String[] list=directory.list();
	for (int i = 0; i < list.length; i++) {
		File f=new File("F:/iO_FILES",list[i]);
		if(f.isFile()){
			System.out.println(list[i]);
		}
	}
	
}
}
