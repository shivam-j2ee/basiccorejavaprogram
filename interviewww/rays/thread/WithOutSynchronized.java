package in.co.rays.thread;


public class WithOutSynchronized {
	public static void main(String[] args) {

		Display d = new Display();
		MyThread1 t = new MyThread1(d, "shubham");
		MyThread1 t1 = new MyThread1(d, "ram");

		t.start();
		t1.start();
	}
}

 class Display {
	public void wish(String name) {

		for (int i = 0; i < 10; i++) {

			System.out.print(i+") Good Morning:");
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}

class MyThread1 extends Thread {

	Display d;
	String name;

	public MyThread1(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}
