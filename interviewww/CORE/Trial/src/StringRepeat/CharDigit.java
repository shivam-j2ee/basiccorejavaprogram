package StringRepeat;

public class CharDigit {
	public static void main(String[] args) {
		
	
	String str = "15 vaishali96";
	
	int letter=0;
	int digit=0;
	int wh=0;
	
for(int i=0;i<str.length();i++) {
	char c=str.charAt(i);
	if(Character.isLetter(c)) {
          letter++;
}if(Character.isDigit(c)) {
      digit++;

}if(Character.isWhitespace(c)) {
wh++;
}}System.out.println(letter);
System.out.println(digit);
System.out.println(wh);

	}}