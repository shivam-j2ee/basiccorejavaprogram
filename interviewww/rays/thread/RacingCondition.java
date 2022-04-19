package in.co.rays.thread;


public class RacingCondition extends Thread {
	
	public static RaceAccount data = new RaceAccount();

	
	public String name;
	
	public RacingCondition(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			data.deposite(name, 1000);
		}
	}
	
	public static void main(String[] args) {
		RacingCondition rc1 = new RacingCondition("A");
		RacingCondition rc2 = new RacingCondition("B");
		
		rc1.start();
		rc2.start();
	}

}
