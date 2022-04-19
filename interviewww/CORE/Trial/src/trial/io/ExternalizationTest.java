package trial.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationTest {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileOutputStream fo=new FileOutputStream("C:/Users/Lenovo/Desktop/trial.txt");
	ObjectOutputStream os=new ObjectOutputStream(fo);
	
	ExternalizationEx ex=new ExternalizationEx("vaishali",23);
	os.writeObject(ex);
	os.close();
	System.out.println(ex.getName());
	System.out.println(ex.getAge());
	
	//Deserialize..
	
	FileInputStream fi=new FileInputStream("C:/Users/Lenovo/Desktop/trial.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	ExternalizationEx e=(ExternalizationEx) oi.readObject();
	System.out.println(e.getName());
	System.out.println(e.getAge());
}
}
