package in.co.rays.Basic;

public class Armstrong {
	
	 public static void main (String []args){
		
		 int no=153;
		 int temp=no;
		 int a, sum=0;
		 
		 while(no>0){
			 
			 a=no%10;
			 sum=sum+a*a*a;
			 no=no/10;
		 }
		 
		 System.out.println(sum);
		 if(temp==sum){
			 System.out.println("yes");
			
		 }else{
			 System.out.println("no");
		 }
		 
	 }

}
