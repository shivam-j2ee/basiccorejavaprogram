package in.co.rays.thread;

public class RaceAccount {
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public  void deposite(String name, int amount) {
		int bal;
		synchronized(this){
			 bal = getBalance() + amount;
			setBalance(bal);
			
		
	}
		System.out.println(name + " new Balance = " + bal);	
	}
	

	
}

