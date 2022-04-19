package in.co.rays.thread;

public class RunnableImpl implements Runnable{

	public String name = null;
	
	public RunnableImpl( String n) {
		this.name = n;
	}
	
	@Override
	public void run() {
for (int i = 0; i < 100; i++) {
	System.out.println(i+" # "+name);
	
}		
	}
	public static void main(String[] args) {
		  Thread t1 = new Thread(new RunnableImpl("Ram"));
		  
		  Thread t2 = new Thread(new RunnableImpl("Shyam"));
		  
		  t1.start();
		  t2.start();
	}
	

}
