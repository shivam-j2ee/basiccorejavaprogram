package com.raystech.Collection;

import java.util.LinkedList;

public class FindMiddleNode {

	public static void main(String[] args) {

		LinkedList l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(7);
		l.add(4);
		l.add(5);
		l.add(6);
		
		System.out.println(l);
		
		int a = l.size();
		int b = l.size()/2;
		
		if(a%2==0){
			System.out.println(l.get(b-1));
			
		}else{
			System.out.println(l.get(b));
		}
		
		
	}

}
