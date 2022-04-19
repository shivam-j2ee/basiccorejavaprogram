package in.co.rays.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationStuent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream f = new FileInputStream("G:/WorkSpace/Interview/Documents_IO/two.ser");
		ObjectInputStream o = new ObjectInputStream(f);
		
		StudentSerializable s = (StudentSerializable)o.readObject();
		System.out.println(s.getName());
		System.out.println(s.getValue());
		
	}

}
