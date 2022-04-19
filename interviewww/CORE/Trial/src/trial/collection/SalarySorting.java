package trial.collection;

import java.util.Comparator;

public class SalarySorting implements Comparator<SalarySorting> {

	private int salary;
	private String name;
	
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}

	 public SalarySorting() {
		// TODO Auto-generated constructor stub
	}
	 
	 public SalarySorting(int salary,String name) {
		 this.salary=salary;
		 this.name=name;
	 }
	 public String toString() {
		return name+" "+salary;
		 
	 }
	@Override
	public int compare(SalarySorting a, SalarySorting b) {
		// TODO Auto-generated method stub
		return b.salary-a.salary;
	}

}
