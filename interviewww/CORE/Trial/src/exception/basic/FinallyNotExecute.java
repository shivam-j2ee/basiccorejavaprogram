package exception.basic;

public class FinallyNotExecute {
public static void main(String[] args) {
	

	int a=10;
	int b=0;
	
	try {
	int c=a/b;
	System.out.println(c);
	}catch(ArithmeticException e) {
		e.printStackTrace();
		System.exit(0);
	}finally {
		System.out.println("finally block");
	}
}
}