package String;

public class Book1 {
	public static void main(String[] args) {
		String name = "SUNILOS";
		name.toLowerCase();
		System.out.println(name);

		//name.repl
		Exception e=new Exception();
	
		char[] c = name.toCharArray();
         String s="";
		for (int i = 0; i < c.length; i++) 
		{
         s = s+c[i];
		}
        System.out.println(s);
	}
}
