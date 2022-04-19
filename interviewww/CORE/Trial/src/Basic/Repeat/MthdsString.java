package Basic.Repeat;

public class MthdsString {
	public static void main(String[] args) {
	
		//methods of string..
	String s="vaishali shah";
	System.out.println(s.startsWith("v"));
	s.indexOf("s");//
	s.lastIndexOf('s');

	s.length();//
	s.startsWith("v");
	s.endsWith("h");
	System.out.println(s.endsWith("shah"));
	s.replace('i','I');
	s.replaceAll("a1","qq");
	s.concat("ash");
	s.trim();
	s.split("");
	
	// Methods of StringBuffer....
	StringBuffer sb=new StringBuffer("shah");
	char c=sb.charAt(0);
	StringBuffer s1=sb.reverse();
	StringBuffer s2=sb.replace(0,2,"xy");
	StringBuffer s3=sb.insert(3,"sd");
	StringBuffer s4=sb.append("ss");
	StringBuffer s5=sb.delete(3,5);
	StringBuffer s6=sb.deleteCharAt(5);
	sb.length();
	int i=sb.capacity();
	int i1=sb.indexOf("sh");
	int i2=sb.lastIndexOf("h");
	} 	
	}
	
	
	
