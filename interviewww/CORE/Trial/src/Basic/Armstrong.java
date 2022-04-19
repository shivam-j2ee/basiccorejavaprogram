package Basic;

public class Armstrong {
public static void main(String[] args) {
	
	int N=153,sum=0,temp;
	int n=N;
	while(n!=0) {
	temp=n%10;
	sum=sum+temp*temp*temp;
	n=n/10;
   }
	if(sum==N) {
	System.out.println("No is armstrong");
	}}
}
