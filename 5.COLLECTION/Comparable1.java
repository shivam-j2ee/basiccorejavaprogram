package com.raystech.Collection;

public class Comparable1 implements Comparable<Comparable1>{

	private int rollNo;
	//private String rollNo;
	private String fName;
	private String lName;
	
	public Comparable1() {

	
	}
	
	public Comparable1(int rollNo,String fName,String lName) {
          
		 this.fName=fName;
		 this.lName=lName;
		 this.rollNo=rollNo;	 
		 
	}

	@Override
	public int compareTo(Comparable1 c1) {

		 return (rollNo-c1.rollNo);
		
		//return (rollNo.compareTo(c1.rollNo));
	}
	
    public String toString(){
    	
    	return rollNo+" "+fName+" "+lName;
    }
	
	
}
