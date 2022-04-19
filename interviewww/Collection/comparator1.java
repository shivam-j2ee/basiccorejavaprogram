package extr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator1 implements Comparator<comparator1> {

	private String fName;
	private String lName;
	private String address;
	//int salary;

	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getAddress() {
		return address;
	}

	public comparator1() {
		// TODO Auto-generated constructor stub
	}

	
	public comparator1(String fName, String lName, String address) {

		// TODO Auto-generated constructor stub
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}

	@Override
	public int compare(comparator1 o1, comparator1 o2) {
		// TODO Auto-generated method stub
		if (o1.fName.equals(o2.fName)) {
			return o1.lName.compareTo(o2.lName);
		} else{
			return o1.fName.compareTo(o2.fName);
	}}

	public String toString() {
		return fName + " " + lName + " " + address;

	}

	public static void main(String[] args) {

		comparator1 cm = new comparator1();

		ArrayList a = new ArrayList();

		a.add(new comparator1("rahul", "soni", "lIG"));
		a.add(new comparator1("aman", "Singh", "nanda"));
		a.add(new comparator1("amit", "sharma", "patnipura"));

		Collections.sort(a, cm);

		for (Object object : a) {
			System.out.println(object);

		}

	}

}
