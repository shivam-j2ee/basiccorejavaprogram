package Basic;

public class Memory {
	protected void finalize() {
		System.out.println("memory optimize");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main");
	Memory m=new Memory();
	Memory n=new Memory();
	
	m=n;
	System.gc();
	
	
	//System.gc() method is equivalent to Runtime.getRuntime().gc() method
     //Runtime.getRuntime().gc();
}

}
