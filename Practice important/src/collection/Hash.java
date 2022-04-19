package collection;

public class Hash 
{
	private String name;
	private int age;

	public Hash(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public int hashCode() {
		String key = name + age;
		return key.hashCode();
	}
	
	public boolean equals(Object o)
	{
		if(o==null)
		{
			return false;
		}
		if(!(o instanceof Hash))
		{
			return false;
		}
		Hash hs = (Hash)o;
		
		if(name.equals(hs.name) && age==hs.age)
		{
			return true;
		}else
		{
			return true;
		}
	}
    
	public static void main(String[] args) 
	{
		Hash h1 = new Hash("JayRam", 50);
		Hash h2 = new Hash("Jayesh", 20);
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h1.equals(h2));
		
	}
}
