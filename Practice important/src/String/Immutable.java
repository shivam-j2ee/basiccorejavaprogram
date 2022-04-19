package String;

public final class Immutable 
{
	private final String name;

	public String getName() {
		return name;
	}
	
	public Immutable(String name)
	{
	  this.name = name;	
	}
	
	public static void main(String[] args) 
	{
      Immutable i = new Immutable("Rahul");
      
      System.out.println(i.name);
      
      Immutable i1 = i;
      
      System.out.println(i==i1);
	}
	
}
