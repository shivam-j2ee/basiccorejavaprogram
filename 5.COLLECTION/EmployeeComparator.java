package com.raystech.Collection;


public class EmployeeComparator {

     private String fName;	
     private String lName;
     private Integer salary;
     /*private int salary;*/
	
     
      public EmployeeComparator(String fName,String lName,Integer salary) {
	        this.fName = fName;
	        this.lName = lName;
	        this.salary = salary;
	        
      }
     
     public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public Integer getSalary() {
		return salary;
	}
	
      public String toString(){
    	  
    	  return fName+" "+lName+" "+salary;
      }   
	
	
}
