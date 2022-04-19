package com.raystech.Thread;

public class Priority extends Thread{
  
	public Priority(String name) {
          
		super(name);
	}
	
	public void run(){
		for(int i=0;i<=30;i++)
			System.out.println(getName() + " P = " + getPriority());
			
	}
	
	
	public static void main(String[] args) {

	 Priority p1 = new Priority("Hukum Pal");	
	 Priority p2 = new Priority("Daksh Pal");
	 Priority p3 = new Priority("Rinsy Pal");
		
	  p1.setPriority(3);
	  p2.setPriority(1);
	  
	  //p3.setPriority(5);         // p3 has default priority 5
 	 
	  p1.start();
	  p2.start();
	  p3.start();
	}

}
