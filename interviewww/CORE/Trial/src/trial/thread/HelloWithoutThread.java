package trial.thread;

public class HelloWithoutThread {
private String name=null;

public HelloWithoutThread(String name) {
	this.name=name;
}
public void run() {
for(int i=1;i<50;i++) {
	System.out.println(i+" "+name);
}
}
public static void main(String[] args) {
	HelloWithoutThread t1=new HelloWithoutThread("vaishali");
	HelloWithoutThread t2=new HelloWithoutThread("shah");
	
	
	t1.run();
	t2.run();
}
}
