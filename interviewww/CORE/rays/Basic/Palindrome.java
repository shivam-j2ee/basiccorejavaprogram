package in.co.rays.Basic;

public class Palindrome {
	public static void main(String[] args) {
		int no=121;
		int a;
		int temp=no;
		int rev=0;
		while(no>0){
			a=no%10;
			rev=rev*10+a;
			no=no/10;
			
		}
		System.out.println(rev);
		if(rev==temp){
			System.out.println("palindrome");
			
		}else{
			System.out.println("no");
		}
	}

}
