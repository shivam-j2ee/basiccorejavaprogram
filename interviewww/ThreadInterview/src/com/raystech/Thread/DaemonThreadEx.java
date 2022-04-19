package com.raystech.Thread;

public class DaemonThreadEx extends Thread{

	@Override
	public void run() {

     System.out.println("Daemon Thread Started " + Thread.currentThread());
     
       while(true){
    	   
    	   try{
    		   Thread.sleep(500);
    		   System.out.println("Daemon Thread : woke up again");    		   
    		   
    	   }catch(InterruptedException e){}
    	   
       }   
 }	
	
	public static void main(String[] args) {

		System.out.println("Main Thread Started");
		
		DaemonThreadEx d = new DaemonThreadEx();
		d.setDaemon(true);
		d.start();
		
		try{
			Thread.sleep(3000);
			System.out.println("main");
		}catch(InterruptedException e){}
		
		System.out.println("Leaving Main Thread");
		System.out.println("Now JVM will exit");
	
	}

}
