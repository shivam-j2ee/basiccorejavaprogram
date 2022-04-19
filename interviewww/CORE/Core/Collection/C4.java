package com.raystech.Collection;

public class C4 {

	private String name;
	private Integer age;
	
	public C4(String name,Integer age) {
 
         this.name=name;
         this.age=age;
         
	}
 	
	public int hashCode(){
		
		String s = name+age;
		return s.hashCode();
		
	}
	public boolean equals(Object o){
		
		if(o==null) return true;
		if(!(o instanceof C4)) return false;
		
		C4 c = (C4)o;
		
		if(name.equals(c.name)&& (age==c.age)) return true;
		else return false;
		
		
	}		
	
}
