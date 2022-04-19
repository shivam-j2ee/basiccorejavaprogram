package com.raystech.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalize {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileOutputStream fileOutputStream=new FileOutputStream("F:/IOExample/abcd.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fileOutputStream);
	
	Employee employee=new Employee();
	employee.setfName("Anu");
	employee.setlName("Sharma");
	employee.setSalary(12000);
	
	oos.writeObject(employee);
	System.out.println("Object Serialised");
	
	FileInputStream fis=new FileInputStream("F:/IOExample/abcd.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	//Employee emp=new Employee();
	
	Employee emp=(Employee) ois.readObject();
	System.out.println(emp.getfName());
	System.out.println(emp.getlName());
	System.out.println(emp.getSalary());
	System.out.println("Object Deserialised");
}
}
