package JavaBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException 
	{
     //1st
	 ObjectCreation ob1 = new ObjectCreation();
	 
	 //2nd
	 ObjectCreation ob2 = (ObjectCreation) Class.forName("JavaBasics.ObjectCreation").newInstance();
	
	//3rd
	 Constructor con = ObjectCreation.class.getConstructor();
	 ObjectCreation ob3 = (ObjectCreation) con.newInstance();
	 
	 //4th
	 ObjectCreation obj = new ObjectCreation();
	 ObjectCreation ob4 = (ObjectCreation) obj.clone();
	
	 //5th
	 FileInputStream on = new FileInputStream("");
	 ObjectInputStream in = new ObjectInputStream(on);
	 ObjectCreation ob5 = (ObjectCreation) in.readObject();
	 
	 System.out.println(ob1);
	 System.out.println(ob2);
	 System.out.println(ob3);
	 /*System.out.println(ob4);*/
	 System.out.println(ob5);
	}
}
