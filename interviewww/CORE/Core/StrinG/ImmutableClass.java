package com.raystech.StrinG;

public final class ImmutableClass {

	private final String fName;
	
	public String getfName(){
		
		return fName;
	}
	
  
	public ImmutableClass(String fName){
	   this.fName=fName;	
		
	}

	public static void main(String[] args) {
		
		ImmutableClass im = new ImmutableClass("vipul");
		
		//System.out.println("First Object Run");
		System.out.println(im.getfName());
		
		/*im = new ImmutableClass("Pal");
		System.out.println("After Changing the Object State");
		System.out.println(im.fName);*/
		
	}
	
}


