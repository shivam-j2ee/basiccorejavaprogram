package com.raystech.Collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PrintEvenNoInListNdFindTime {

	public static void main(String[] args) {

		ArrayList l = new ArrayList<>();

		long l1 = System.currentTimeMillis();
		//System.out.println("First " +l1);
		System.out.println("Time before adding an element = " +l1);
		for(int i=0;i<=10000;i++){
			if(i%2!=0){
				l.add(i);
				
			}
			
		}
		System.out.println(l);
		long l2 = System.currentTimeMillis();
		System.out.println("Time After adding an element = " +l2);
		System.out.println("Taken Time to add an element = "+(l2-l1));
		
		
	}

}
