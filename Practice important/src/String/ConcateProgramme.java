package String;

public class ConcateProgramme 
{
	public static void main(String[] args) 
	{
		String fname = "Rahul";
		String lname = "Sirwani";
		
		String s = fname+" "+lname;
		
		System.out.println(s);
    
		String s1 = fname.concat(lname);
		
		System.out.println(s1);
	}
}
