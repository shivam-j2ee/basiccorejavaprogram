package in.co.rays.Basic;

interface Lamda{
	public String name(String s);
	
}
public class Lamdaex {
public static void main(String[] args) {
	
	Lamda m = (s)->{
		return s;
		
	};
	System.out.println(m.name("sid"));
}
}
