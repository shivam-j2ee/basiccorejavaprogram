package exception.basic;

import java.util.Comparator;

public class SalarySorting implements Comparable<SalarySorting> {

	private String rollNo;
	private String name;
	
	
	public String getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	
	public SalarySorting(String rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	public SalarySorting() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return rollNo+" "+name;
	}
	@Override
	public int compareTo(SalarySorting o) {
		// TODO Auto-generated method stub
		return rollNo.compareTo(o.getRollNo());
	}
	
	}
	

