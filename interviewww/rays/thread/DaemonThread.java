package in.co.rays.thread;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		System.out.println("Demon T started " + Thread.currentThread());

		// Infinite loop wake in every 500ms
		while (true) {
			try {
				Thread.sleep(3000);
				System.out.println("Demon T: woke up again");
			} catch (InterruptedException x) {
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Main Started");

		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException x) {

		}
		System.out.println("Leaving Main Method");
		System.out.println("Now JVM will exit");
	}
}
