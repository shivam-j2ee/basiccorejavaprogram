package trial.thread;

public class RaceAccount {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(String name,int amount) {
	int bal;
	synchronized (this) {
		bal=getBalance()+amount;
		setBalance(bal);
	}
	System.out.println(name +"new balance" +bal);
	}
}
