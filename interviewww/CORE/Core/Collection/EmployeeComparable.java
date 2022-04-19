package com.raystech.Collection;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

	
	private String name;
	private Integer age;
	private String salary;
	
	public EmployeeComparable(String name,Integer age,String salary) {
   
		 this.name = name;
		 this.age = age;
		 this.salary = salary;
		
	}
	public String getName(){
		return name;
	}
	public Integer getAge(){
		return age;
	}
	public String getSalary(){
		return salary;
	}
	
	
	public int compareTo(EmployeeComparable emp) {

		return name.compareTo(emp.getName());
	}
	  
	 /* public int compareTo(Employee emp1){
		  return age.compareTo(emp1.getAge());		  
	  }
	  
	  public int compareTo(Employee emp2){
		  return salary.compareTo(emp2.getSalary());		  
	  }*/
	  
	
}
