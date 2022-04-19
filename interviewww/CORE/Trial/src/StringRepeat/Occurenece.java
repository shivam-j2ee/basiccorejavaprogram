package StringRepeat;

public class Occurenece {
public static void main(String[] args) {
	String s="shah";
	int c=0;
	for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(ch=='h') {
		c++;
	}
}System.out.println(c);
}}
