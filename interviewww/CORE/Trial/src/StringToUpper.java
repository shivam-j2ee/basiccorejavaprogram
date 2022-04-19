
public class StringToUpper {
public static void main(String[] args) {
	String s="welcome";
	/*System.out.println(s.toUpperCase());*/
	
	//or
	
	for(int i=0;i<s.length();i++) {
		int n=s.charAt(i);
		if(n>96&&n<123) {
			n=n-32;
			System.out.println((char)n);
			
		}
	}
	
}
}
