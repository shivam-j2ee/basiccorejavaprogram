package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("F:/iO_FILES/ex.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("fgvh");
		ExternalizationEx ex = new ExternalizationEx("Shubham", 23);
		oos.writeObject(ex);
		oos.close();
		
		FileInputStream fis = new FileInputStream("F:/iO_FILES/ex.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ExternalizationEx ex2 = (ExternalizationEx) ois.readObject();
		System.out.println(ex2.getName());
		System.out.println(ex2.getAge());
		
	}

}
