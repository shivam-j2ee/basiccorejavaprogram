package Basic.Repeat;

public class EvenSum {
public static void main(String[] args) {
	int sum=0,count = 0;
	for(int i=2;i<=50;i++) {
		if(i%2==0) {
			
			sum=sum+i;
			System.out.println(i);
			count=count+1;
		}
	}System.out.println(sum);
	int avg=sum/count;
	System.out.println(avg);
}
}
