package com.raystech.Collection;

public class HashcodeAndEqualsMethod {

	
	private String name;
	private int age;
	
	public HashcodeAndEqualsMethod(String name,int age) {
	
		this.name = name;
		this.age = age;
		
	}
	
	      public int HashCode(){
	    	  
	    	  String key = name+age;
	    	  return key.hashCode();
	    	  
	      }
	      public boolean equals(Object o){
	  		
			  if(o==null) return false;
			  if(o==this) return true;
			  if(!(o instanceof HashcodeAndEqualsMethod)) return false;
		   
		    HashcodeAndEqualsMethod h = (HashcodeAndEqualsMethod)o;
		      if(name.equals(h.name)&&(age==h.age)){
		    	  
		    	  return true;
		      }else{
		    	  
		    	  return false;
		      }     
	}
}
