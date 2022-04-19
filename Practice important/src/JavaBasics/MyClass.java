package JavaBasics;

interface Age 
{ 
    int x = 21; 
    void getAge(); 
}
//Myclass implement the methods of Age Interface 
public class MyClass implements Age 
{

	@Override
	public void getAge() 
	{
		// printing the age 
        System.out.print("Age is "+x); 
	}

}
