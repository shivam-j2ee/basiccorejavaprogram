package com.raystech.Thread;

public class ThreadGroupEx extends Thread {

	public ThreadGroupEx(ThreadGroup tg,String name) {
     
		super(tg,name);
	
	}
	
	public void run(){
		
		for(int match=1;match<10;match++){
			String msg = getName();
			msg = msg + " played match# " + match;
			
			System.out.println(msg);			
		}
		
	}
	
	public static void main(String[] args) {

		ThreadGroup team = new ThreadGroup("Team India");
		ThreadGroupEx t1 = new ThreadGroupEx(team, "Hukum Pal");
		ThreadGroupEx t2 = new ThreadGroupEx(team, "Virat Kohali");
		
		t1.start();
		t2.start();
		
		System.out.println(" Thread Group Info ");
		System.out.println("Name : " + team.getName());
		System.out.println("Parent Group : " + team.getParent());
		System.out.println("Active Threads : " + team.activeCount()+"  " + Thread.currentThread());
		System.out.println("Active Sub-Groups : " + team.activeGroupCount());
		System.out.println(" Thread Group Info End : " + team.getMaxPriority());
		System.out.println("Thread is Daemon : "+ team.isDaemon());
		System.out.println("Thread is Destroy : " + team.isDestroyed());
		 //team.list();
		
	}

}
