package com.raystech.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	FileOutputStream fos=new FileOutputStream("F:/abc.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	Person person=new Person();
	person.setfName("Radha");
	person.setlName("Waswani");
	person.setAddress("Indore");
	person.setAge(25);
	oos.writeObject(person);
	oos.close();
	fos.close();
	System.out.println("Object Serialised");
	FileInputStream fis=new FileInputStream("F:/abc.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Person p=(Person)ois.readObject();
	System.out.println(p.getfName());
	System.out.println(p.getlName());
	System.out.println(p.getAddress());
	System.out.println(p.getAge());
	System.out.println("Object Deserialised");
}
}
