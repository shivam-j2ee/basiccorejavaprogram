package Basic;

public class Palindrome {
public static void main(String[] args) {
	
	int N=123,temp;
	int n=N,sum=0;
	
	while(n>0) {
	temp=n%10;
	sum=sum*10+temp;
	n=n/10;
	}
	System.out.println("After reverse no is= "+sum);
	
	if(N==sum) {
		System.out.println("No. is palindrome");
	}else {
		System.out.println("No. is not palindrome");
	}
	
}
}
