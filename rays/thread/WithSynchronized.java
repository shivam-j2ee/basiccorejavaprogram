package in.co.rays.thread;


public class WithSynchronized {
	public static void main(String[] args) {
		DisplayOne d = new DisplayOne();
		
		MyThread2 t1 = new MyThread2(d, "ram");
		MyThread2 t2 = new MyThread2(d, "shyam");
		
		t1.start();
		t2.start();
	}
}

class DisplayOne {
	
	public synchronized void wish(String name) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i+") Good moring: "+name);
		}
	}
}

class MyThread2 extends Thread {
	
	DisplayOne d;
	String name;
	
	public MyThread2(DisplayOne d, String name) {
		this.d=d;
		this.name=name;
	}

	@Override
	public void run() {
		
		d.wish(name);
	}
	
}
