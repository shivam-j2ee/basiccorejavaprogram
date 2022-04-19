package JavaBasics;

public class Palidrome {

	public static void main(String[] args) {
		
		int n =12321;
		int temp = n;
		int rev =0;
		
		
		while(n>0){
			
			int a= n%10;
			rev = rev*10+a;
			n=n/10;
		}
		if(temp== rev){
			
			System.out.println("PAlidrome no");
		}else{
			System.out.println(" not Palidrome no");
		}
	}
}
