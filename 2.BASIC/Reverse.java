package in.co.rays.Basic;

public class Reverse {
	public static void main(String[] args) {
		
		int i=3698;
		 int rev=0;
		while(i>0){
			
			rev=rev*10;
			rev=rev+(i%10);
			i=i/10;
			
		}
		System.out.println(rev);
	}
	}

