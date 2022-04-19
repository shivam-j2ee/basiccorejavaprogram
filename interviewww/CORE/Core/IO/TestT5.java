package com.raystech.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestT5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D:/C Data/hukumchand_pal.ser"));
		
		T5 t = new T5("Ankit",35);
		o.writeObject(t);
		
		ObjectInputStream i = new ObjectInputStream(new FileInputStream("D:/C Data/hukumchand_pal.ser"));
		
		T5 t1 = (T5)i.readObject();
		
		i.close();
		o.close();
		
		System.out.println(t1.getName());
		System.out.println(t1.getTemp());
		
		/*i.close();
		o.close();*/
	}

}
