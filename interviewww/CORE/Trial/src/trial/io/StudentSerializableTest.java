package trial.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerializableTest {
public static void main(String[] args) throws IOException, ClassNotFoundException {

	//Serialization strt.
	FileOutputStream f=new FileOutputStream("I:/FileIO/trial.txt"); //write stream of raw byte.
	ObjectOutputStream o=new ObjectOutputStream(f); //serialize objects into byte stream.
	StudentSerializable ss=new StudentSerializable("vaishali","shah");
	o.writeObject(ss);
	o.close();
	
	System.out.println(ss.getName());
	System.out.println(ss.getValue());
	System.out.println("Serialization is complete.."); //serialization...
	//Serialization end..
	
	//Deserialization...
	FileInputStream fi=new FileInputStream("I:/FileIO/trial.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	
	StudentSerializable s=(StudentSerializable) oi.readObject();
	
	System.out.println(s.getName());
	System.out.println(s.getValue());
	System.out.println("Deserialization is complete..");//Deserialization end...

}
}