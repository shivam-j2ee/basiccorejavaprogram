package Basic;

public class Fibonacci {
public static void main(String[] args) {
	int a=0,b=1;
	
	System.out.println(a);
	System.out.println(b);

	
	for(int i=0;i<=4;i++) {
		int c=a+b;
		a=b;
		b=c;
	
		System.out.println(c);
}}
}
