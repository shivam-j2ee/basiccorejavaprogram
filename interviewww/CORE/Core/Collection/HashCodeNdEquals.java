package com.raystech.Collection;

public class HashCodeNdEquals {

	private String name;
	private int age;
	
	public HashCodeNdEquals(String name,int age) {
             this.name=name;
             this.age=age;
	
	}
	
	public int hashCode(){
	      
		 String s = name+age;
        System.out.println(s);
		 return s.hashCode();
		
	}
	
	public boolean equals(Object o){
		
		if(o==null) return false;
		if(!(o instanceof HashCodeNdEquals)) return false;
		
		HashCodeNdEquals h = (HashCodeNdEquals)o;
		if((name.equals(h.name))&& (age==h.age)){
			return true;
		}
		else {return false;}
		
	}
	
	
}
