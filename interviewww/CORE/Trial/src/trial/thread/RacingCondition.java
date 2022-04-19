package trial.thread;

public class RacingCondition extends Thread{
	private String name;
	
	public static RaceAccount data=new RaceAccount();
	
	public RacingCondition(String name) {
	this.name=name;
	}
	
	public void run() {
		for(int i=1;i<5;i++) {
			data.deposit(name, 1000);
		}
	}
	
public static void main(String[] args) {
	RacingCondition r1=new RacingCondition("vaishali");
	RacingCondition r2=new RacingCondition("shah");
	
	r1.start();
	r2.start();
}
}
