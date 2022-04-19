package trial.thread;

public class ImplementRunnable implements Runnable {
	
	private String name=null;
	
	public ImplementRunnable(String name) {
		this.name=name;
	}

	@Override
	public void run() {
      for(int i=1;i<50;i++) {
    	  System.out.println(i+" "+name);
      }		
	}
	public static void main(String[] args) {
		ImplementRunnable r1=new ImplementRunnable("vaishali");
		ImplementRunnable r2=new ImplementRunnable("shah");
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
