package StringRepeat;

public class Replace {
public static void main(String[] args) {
	String s="vaishali";
	String s1=s.replace("ai","@");
	System.out.println(s1);
	
	String s2=s.replaceAll("[ai]","@");
	System.out.println(s2);
}
}
