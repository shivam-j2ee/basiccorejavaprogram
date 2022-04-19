package in.co.rays.string;

public class CountDoubleChar {
	public static void main(String[] args) {
		  
		String str = "siddharth jainaa";
		
		int c=0;

		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i)=='a'){
				c++;
			
			}
			
		}
		System.out.println(c);
				
	}
	

}
