package Basic.Repeat;

public class Prime {
public static void main(String[] args) {
	int n=27,m=n/2;
	if(n==0&&n==1) {
		System.out.println("Not prime");
	}
	boolean flag=true;
	for(int i=1;i<m;i++) {
	if(n%i==0) {
		System.out.println("not prime");
		flag=false;
		break;
	}}
	if(flag==true) {
		System.out.println("prime");
	}
}
}
