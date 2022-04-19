package DateTen;
//Occurence of Character..
public class Five {
public static void main(String[] args) {
	String s="vaishali shah";
	int c=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='a') {
			c++;
		}
	}System.out.println(c);
}
}
