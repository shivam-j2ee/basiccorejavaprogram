package JavaBasics;

public class ReverseNumber11 {
public static void main(String[] args) {
	
	int n =1234;
	int result=0;
	
	while(n>0){
		
		int a =n%10;
		
		result = result*10+a;
		
		n=n/10;
	}
	System.out.println(result);
}
}
