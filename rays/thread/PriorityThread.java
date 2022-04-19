package in.co.rays.thread;

public class PriorityThread extends Thread{
	
	public PriorityThread(String name){
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i <=50; i++) {
			System.out.println(getName()+" p = "+getPriority());
			
		}
		
	}
	public static void main(String[] args) {
		PriorityThread t1 = new PriorityThread("Thread#A");
		PriorityThread t2 = new PriorityThread("Thread#B");
		PriorityThread t3 = new PriorityThread("Thread#C");
		
		t1.setPriority(3);//priorty
		t2.setPriority(1);//Lowest Priorty
		
		//t3 has default priorty 5
		
		t1.start(); t2.start();t3.start();
	}
}
