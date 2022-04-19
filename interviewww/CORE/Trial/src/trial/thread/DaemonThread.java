package trial.thread;

public class DaemonThread extends Thread {

	public void run() {
	System.out.println("Daemon"+Thread.currentThread());
	
	/*while(true) {
		try {
			Thread.sleep(3000);
			System.out.println("Woke up again");
		}catch(InterruptedException e) {}
	}*/
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		DaemonThread t=new DaemonThread();
		t.setDaemon(true);
		t.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println("leaving main method");
			System.out.println("JVM will exit");
		}
	}
}
