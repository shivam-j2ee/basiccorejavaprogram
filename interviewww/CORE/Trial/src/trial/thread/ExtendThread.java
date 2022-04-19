package trial.thread;

public class ExtendThread extends Thread {
	
	private String name;
	
	public ExtendThread(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=1;i<50;i++) {
			System.out.println(i+" "+name);
		}
	}
	public static void main(String[] args) {
		ExtendThread t1=new ExtendThread("vaishali");
		ExtendThread t2=new ExtendThread("shah");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
