package faltu.no.io;

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
	
	ExternalizationEx e=new ExternalizationEx("v",21);
	os.writeObject(e);
	
	os.close();
	System.out.println(e.getAge());
	System.out.println(e.getName());
	
	FileInputStream fi=new FileInputStream("C:/Users/Lenovo/Desktop/trial.txt");
	ObjectInputStream oi=new ObjectInputStream(fi);
	
	ExternalizationEx ee=(ExternalizationEx) oi.readObject();
	oi.close();
	System.out.println(ee.getAge());
	System.out.println(ee.getName());
	
}
}
