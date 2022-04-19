package com.raystech.Collection;

import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		
		
		
		/*LinkedList l= new LinkedList();
		
		for(int i=1;i<=10;i++){
			
			l.add(i);
		}
	  System.out.println(l.size());	
		int a=l.size()/2;
		System.out.println("middle node is " + l.get(a));
			*/
			
		
		LinkedList list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		list.add(6);
		list.add(5);
		list.add(7);
			System.out.println(list);
			int size=list.size();
			int size1=list.size()/2;
			if(size%2==0){
				System.out.println(list.get(size1-1));
			}
			else
				System.out.println(list.get(size1));
			}

}