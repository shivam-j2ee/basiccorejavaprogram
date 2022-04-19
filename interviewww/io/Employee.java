package com.raystech.core.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	private String fName=null;
	private String lName=null;
	private transient int salary=0;
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		fName=(String) oi.readObject();
		lName=(String) oi.readObject();
		salary=oi.readInt();
		System.out.println(fName+lName+salary);
	}

	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		oo.writeObject(fName);
		oo.writeObject(lName);
		oo.writeInt(salary);
		
	}
}