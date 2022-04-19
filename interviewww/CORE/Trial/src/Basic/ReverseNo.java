package Basic;

public class ReverseNo {
public static void main(String[] args) {
	int n=321456,sum=0,temp;
	
	while(n!=0) {
	temp=n%10;
	sum=sum*10+temp;
	n=n/10;
	}
	System.out.println(sum);
}
}
