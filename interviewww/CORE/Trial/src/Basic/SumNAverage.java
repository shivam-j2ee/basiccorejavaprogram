package Basic;

public class SumNAverage {
public static void main(String[] args) {
	int sum=0,i,count=0;
	for(i=2;i<=50;i++) {
		if(i%2==0) {
			System.out.println(i);
			sum=sum+i;
			count=count+1;
		}}
		
		System.out.println("sum"+sum);
		System.out.println(sum/count);
	
}
}
