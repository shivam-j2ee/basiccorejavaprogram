package OOPPractice;

public class TestMethodArray 
{
	public static void main(String[] args) 
	{
     Shape[] s = new Shape[2];
     s[0] = new Circle();
     s[1] = new Rectangle();
     
     double d = totalArea(s);
     System.out.println("Total area is  "+d);
     
	}
	
	public static double totalArea(Shape[] s)
	{
		double total=0;
		for (int i = 0; i < s.length; i++) 
		{
          total = total+s[i].area();
		}		
		return total;
	}
}
