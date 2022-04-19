package com.raystech.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class UseExternalizable implements Externalizable{

	private String name;
	private int age;
	private transient int temp;
	
	public UseExternalizable() {}
	
	
	public UseExternalizable(String name,int age,int temp) {

		 this.name=name;
		 this.age=age;
		 this.temp=temp;
	
	}
	
	 	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public int getTemp() {
		return temp;
	}


	public void writeExternal(ObjectOutput o) throws IOException{
		
		o.writeObject(name);
		o.writeInt(age);
		o.writeInt(temp);
		o.writeBoolean(true);
		
	}
	
	public void readExternal(ObjectInput i) throws IOException, ClassNotFoundException{
		
		name = (String)i.readObject();
		age = i.readInt();
		temp = i.readInt();
		
		
	}
	
}
