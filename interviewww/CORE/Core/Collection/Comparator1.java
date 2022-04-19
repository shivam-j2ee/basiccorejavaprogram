package com.raystech.Collection;

import java.util.Comparator;

public class Comparator1 implements Comparator<Comparator1>{

	private String firstName;
	private String lastName;
	private Integer age;
	
	public Comparator1() {	}
	
	public Comparator1(String firstName,String lastName,Integer age) {

	       this.firstName=firstName;
	       this.lastName=lastName;
	       this.age=age;	
	
	}
	
	
	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public Integer getAge() {
		return age;
	}



	public int compare(Comparator1 s1,Comparator1 s2){
		
		return (s1.firstName+"  "+s1.lastName).compareTo(s2.firstName+"  "+s2.lastName);
		
	}
	
	public String toString(){
		
		return firstName+" "+lastName;
	}
	
}
