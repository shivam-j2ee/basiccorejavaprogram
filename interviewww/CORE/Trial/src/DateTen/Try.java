package DateTen;

public class Try {
public static void main(String[] args) {
	
	String s="Welcome 2019";
	int Char=0;
	int Digit=0;
	int Space=0;
	
	for(int i=0;i<s.length();i++) {
		if(Character.isLetter(s.charAt(i))) {
			Char++;
		}if(Character.isDigit(s.charAt(i))){
			Digit++;
		}if(Character.isWhitespace(s.charAt(i))) {
			Space++;
		}
	}System.out.println(Char);
	System.out.println(Digit);
	System.out.println(Space);
}}
