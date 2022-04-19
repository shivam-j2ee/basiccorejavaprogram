package com.raystech.Thread;

public class Account {

	
	private  int balance=0;
	
	public int getBalance() {
		databaseDelay();
		return balance;
	}

	public void setBalance(int balance) {
		databaseDelay();
		this.balance = balance;
	}

	public synchronized void deposit(String msg,int amt){
		
		int bal = getBalance() + amt;
		 setBalance(bal);
		 System.out.println(msg + " new balance " + bal);
		
	}
	
	/*public void deposit(String msg,int amt){
		synchronized (this) {
			
		
		int bal = getBalance() + amt;
		 setBalance(bal);
		 System.out.println(msg + " new balance " + bal);
		
	}
}*/
	
	public void databaseDelay(){
		
		try{
			Thread.sleep(200);
			
		}catch(InterruptedException e){}
	
	  
	}
	
}
