package com.raystech.Thread;

public class RacingConditionUsingSynchronized extends Thread {

	public static Account data = new Account();
	
	public RacingConditionUsingSynchronized(String name) {
	
		 super(name);
	}
	
	public void run(){
		
		for(int i=0;i<5;i++){
			data.deposit(getName(),1000);
			
		}
	}
	
	public static void main(String[] args) {

		RacingConditionUsingSynchronized r1 = new RacingConditionUsingSynchronized("Hukum Pal");
		RacingConditionUsingSynchronized r2 = new RacingConditionUsingSynchronized("Nitin Sharma");
		
		//r2.setPriority(3);
		
		r1.start();
		r2.start();
		
		
	}

}
