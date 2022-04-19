package in.co.rays.string;

public class UpperAndLower {
	
	public static void main(String[] args){
	String s="Kuch v Likh Do";
	
	String s1 = "";
	
	for (int i = 0; i < s.length(); i++) {
		
		String s2 = s.substring(i,i+1);
		
		if(s2.matches("[A-Z]"))
		{
			s1=s1+s2.toLowerCase();
			
		}else{
			
			s1= s1+s2.toUpperCase();
		}
		
	}
	System.out.println(s1);
	}}

