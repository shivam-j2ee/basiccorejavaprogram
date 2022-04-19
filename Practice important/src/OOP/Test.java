package OOP;

public class Test 
{
	public static void main(String[] args) 
	{
      //Parent can Keep child Reference
	  //And you can access only members exposed by parent
	  //child members can not be accessed.
		Shape s = new Circle();
		s.setColor("Red");
		s.setBorderWidth(5);
		
		//Child can not keep Parent Reference.It will thrw Compile time error
		//Circle c = new Shape();    Compilation error
		
		Circle c = new Circle();
		c.setRadius(5);
		float area = (float) c.area();
		System.out.println(area);
	}
}
