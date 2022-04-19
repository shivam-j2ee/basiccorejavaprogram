package exception.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
public static void main(String[] args) {
	//SalarySorting s=new SalarySorting();
	SalarySorting s1=new SalarySorting("101","v");
	SalarySorting s2=new SalarySorting("102","r");
	SalarySorting s3=new SalarySorting("105","t");
	
	ArrayList al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	Collections.sort(al);
	for(Object o:al) {
	System.out.println(o);
	}
}
}
