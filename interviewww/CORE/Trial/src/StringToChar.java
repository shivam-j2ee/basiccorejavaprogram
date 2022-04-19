
public class StringToChar {

	public static void main(String[] args) {
		String s="java";
		System.out.println(s.length());
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			System.out.println(i+"="+c);
		}
	}
}
