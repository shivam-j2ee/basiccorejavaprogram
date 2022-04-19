package StringRepeat;

public class DoubleChar {
public static void main(String[] args) {
	String s="shahh";
	
	int ch=0;
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='h') {
			ch++;
		}
	}System.out.println(ch);
}
}
