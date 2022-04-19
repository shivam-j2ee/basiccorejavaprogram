package com.raystech.Thread;

public class ThreadEx1 implements Runnable {

	
	private String name;
	
	public ThreadEx1(String name) {

		  this.name=name;
	}
	
	public void run(){
		
		for(int i=0;i<=20;i++){
			System.out.println(i+ "  " + name);
			
		}
		
	}
	
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadEx1("Vipul"));
		Thread t2 = new Thread(new ThreadEx1("Ankit"));
	
		/*ThreadEx1 t1 = new ThreadEx1("Hukum Pal");
		ThreadEx1 t2 = new ThreadEx1("Ankit Jain");*/
		
		t1.start();
		t2.start();
		
		
	}

}
