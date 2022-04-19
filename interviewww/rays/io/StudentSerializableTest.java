package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerializableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		/*
		Serialization
		*/
		FileOutputStream fos = new FileOutputStream("F:/iO_FILES/two.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		StudentSerializable std = new StudentSerializable("shubham", "chaurasia");
		
		oos.writeObject(std);
		oos.close();
		System.out.println(std.getName());
		System.out.println(std.getValue());
		System.out.println("Serialization is complete");
		
		/*
		Deserialization
		*/
		FileInputStream f = new FileInputStream("F:/iO_FILES/two.ser");
		ObjectInputStream o = new ObjectInputStream(f);
		
		StudentSerializable s = (StudentSerializable) o.readObject();
		System.out.println(s.getName());
		System.out.println(s.getValue()); // transient variable will remove after serialization
		
	}

}
