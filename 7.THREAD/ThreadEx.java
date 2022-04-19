package com.raystech.Thread;

public class ThreadEx  extends Thread{

	private String name;
	
	public ThreadEx(String name) {

	     this.name=name;
	
	}
	
	public void run(){
		
		for(int i=0;i<=50;i++){
			
			System.out.println(i+ " " + name );
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		 ThreadEx t1 = new ThreadEx("Hukum Pal");
		 ThreadEx t2 = new ThreadEx("Nitin Sharma");
		
		 t1.start();
		 t2.start();
		 
		/* for(int i=0;i<=50;i++){
			 System.out.println("This is Thread");
			 
			 
		 }*/
	}

}
