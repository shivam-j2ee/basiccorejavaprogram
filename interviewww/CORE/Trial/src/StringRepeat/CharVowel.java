package StringRepeat;

public class CharVowel {
public static void main(String[] args) {
	String s="vaishali";
	int c=0;
	int v=0;
	int i=0;
	
	for( i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		v++;
	}else {
c++;}
	}

System.out.println(v);
System.out.println(c);
}}