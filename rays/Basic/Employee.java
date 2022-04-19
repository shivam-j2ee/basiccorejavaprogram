package in.co.rays.Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//ObjectCreation

public class Employee {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		
		Employee e1 = new Employee();
		
		Employee e2 = (Employee) Class.forName("in.co.rays.Basic.Employee").newInstance();
		
		Constructor cons = Employee.class.getConstructor();
		Employee e3 = (Employee) cons.newInstance();
		
		Employee obj = new Employee();
		Employee e4 = (Employee) obj.clone();
		
		FileInputStream on = new FileInputStream(" ");
		ObjectInputStream in = new ObjectInputStream(on);
		Employee e5 = (Employee) in.readObject(); 
	}

}
