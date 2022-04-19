package Basic.Repeat;

public class Reverse {
public static void main(String[] args) {
	int n=3214,temp,sum=0;
	
	while(n!=0) {
		temp=n%10;
		sum=sum*10+temp;
		n=n/10;
	}
	System.out.println(sum);
}
}
