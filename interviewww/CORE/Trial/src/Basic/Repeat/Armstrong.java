package Basic.Repeat;

public class Armstrong {
public static void main(String[] args) {
	int N=371,temp,sum=0;
	int n=N;
	
	while(n!=0) {
		temp=n%10;
		sum=sum+temp*temp*temp;
		n=n/10;
	}if(sum==N) {
		System.out.println("Armstrong");
	}else {
		System.out.println("Not Armstrong");
	}
}
}
