package StringRepeat;

public class CharToString {
public static void main(String[] args) {
	//Convert Character to string...
	char c='v';
	String s=Character.toString(c);
	System.out.println(s);
	
	//Convert Character array to string...
	char[] c1= {'e','g','y'};
	//String s1=new String(c1);
	String s1=String.valueOf(c1);
	System.out.println(s1);
	
	//Convert String to char..
	String s3="vaishali";
	for(int i=0;i<s3.length();i++) {
		char c3=s3.charAt(i);
		System.out.println(c3);
	}
	
	//Convert String to char array..
	String s4="shah";
	char[] c4=s4.toCharArray();
	for(int i=0;i<s4.length();i++) {
		System.out.println(c4[i]);
	}
}
}
