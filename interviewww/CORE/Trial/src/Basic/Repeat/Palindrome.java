package Basic.Repeat;

public class Palindrome {
public static void main(String[] args) {
	int N=123,temp,sum=0;
	int n=N;
	
	while(n!=0) {
		temp=n%10;
		sum=sum*10+temp;
		n=n/10;
	}System.out.println(sum);
	if(sum==N) {
		System.out.println("palindrome");
	}else {
		System.out.println("Not palindrome");
	}
}
}
