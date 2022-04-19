package com.raystech.core.io;

import java.io.Serializable;

public class Person implements Serializable{
		private String fName=null;
		private String lName=null;
		private String address=null;
		//private transient int age=0;
		private  int age=0;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		
}
