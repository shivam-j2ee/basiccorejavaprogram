package com.raystech.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class T5 implements Externalizable {

	private String name;
	private transient int temp;
	
	public T5() {}
	
	public T5(String name,int temp) {
		this.name=name;
		this.temp=temp;
		
		
	}

	public String getName() {
		return name;
	}

	public int getTemp() {
		return temp;
	}
	
	public void writeExternal(ObjectOutput o)throws IOException{
		
		o.writeObject(name);
		o.writeInt(temp);
		o.writeFloat(232.4F);
		o.writeChar('H');
		//o.writeInt(temp);
		o.writeBoolean(true);
		
	}
	
   public void readExternal(ObjectInput i)throws IOException,ClassNotFoundException{
		
	   name = (String)i.readObject();
	   temp = i.readInt();
		
	}
	
}
