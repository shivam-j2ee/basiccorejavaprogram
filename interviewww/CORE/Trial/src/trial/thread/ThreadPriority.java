package trial.thread;

public class ThreadPriority extends Thread {

	public ThreadPriority(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=0;i<50;i++) {
		System.out.println(getName()+" "+getPriority());
		}
	}
	public static void main(String[] args) {
		ThreadPriority t1=new ThreadPriority("vaishali");
		ThreadPriority t2=new ThreadPriority("shah");
		ThreadPriority t3=new ThreadPriority("vs");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
