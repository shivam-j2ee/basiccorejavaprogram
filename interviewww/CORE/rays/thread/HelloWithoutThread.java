package in.co.rays.thread;

public class HelloWithoutThread {
	String name = null;
	
public HelloWithoutThread(String threadname) {

	name = threadname;
}
public void run(){
	for (int i = 0; i < 50; i++) {
		System.out.println(i+" hello Thread"+ name);
	}
}
public static void main(String[] args) {
	
	HelloWithoutThread t1 = new HelloWithoutThread(" Kay re");
	HelloWithoutThread t2 = new HelloWithoutThread(" kithhe ja rao re");
	
	t1.run();
	t2.run();
}

}
