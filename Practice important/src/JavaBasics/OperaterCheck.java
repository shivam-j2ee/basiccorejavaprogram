package JavaBasics;

public class OperaterCheck 
{
	public static void main(String[] args) 
	{
		int i = 1;
		//System.out.println(i);
		i = i++ + i++ + i++ + i++ + i++;
		System.out.println(i);
		
		int a = 1;
		a = ++a + ++a + ++a + ++a + ++a;
		System.out.println(a);
		
		int b = 50;
		b = b-- - b-- - b--;
		System.out.println(b);
		
		int c = 50;
		c = --c - --c - --c;
		System.out.println(c);
		
		String s = "Shubham";
		
		String s1 = (s=="Shubham") ? "yes":"no";
			System.out.println(s1);
	}
}
