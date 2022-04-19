package in.co.rays.thread;

public class HelloWithThread extends Thread {
	
	private String name = null;
	
	public HelloWithThread(String threadName){
		name = threadName;
	}

	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" # "+ name);
			
		}
	}
	public static void main(String[] args) {
		 HelloWithThread t1 = new HelloWithThread("Ram");
		 HelloWithThread t2 = new HelloWithThread("Shyam");
		 
		 t1.start();
		 t2.start();
		 
		 for (int i = 0; i < 10; i++) {
			 System.out.println(" Main Thread ");
			
		}
	}
}
