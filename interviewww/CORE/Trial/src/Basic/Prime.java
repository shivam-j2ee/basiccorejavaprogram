package Basic;

public class Prime {
public static void main(String[] args) {
	int n=11,flag=0;
	int m=n/2;
	
	if(n==0 || n==1) {
		System.out.println("No. is not prime");
	}else {
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println("No. is not prime");
				flag=1;
				break;
			}
		}if(flag==0) {
			System.out.println("No. is prime");
		}
	}
}
}
