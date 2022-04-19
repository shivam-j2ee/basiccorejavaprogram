package JavaBasics;

class A
{
   public void show()
   {
	   System.out.println("A class show");
   }
}

public class AnanymousClass 
{
	public static void main(String[] args)  
    { 
        // Myclass is implementation class of Age interface 
        MyClass obj=new MyClass()
        {
			@Override
			public void getAge() 
			{
              System.out.println("New Age is 30");
			}
        }; 
  
        // calling getage() method implemented at Myclass 
        obj.getAge(); 
        
        
        A a1 = new A()
        {
			@Override
			public void show() 
			{
             System.out.println("Ananymous class show");
			}	
        };
        a1.show();
        
    } 
}
