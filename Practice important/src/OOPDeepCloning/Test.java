package OOPDeepCloning;

public class Test 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
     Customer c1 = new Customer("Ram");
     
     Customer c2 = (Customer)c1.clone();
     System.out.println("c2   "+c2.name);
     c2.name = "Balram";
//     System.out.println("c2   "+c2.name);
     c2.account.balance=20;
     
     System.out.println("Orignal Object");
     System.out.println("Name :  "+c1.name);
     System.out.println("Balance : "+c1.account.balance);
     
     System.out.println("Cloned Object");
     System.out.println("Name :  "+c2.name);
     System.out.println("Balance : "+c2.account.balance);
     
 /* Output 
  * Name :  Ram
     Balance : 10.0
     Cloned Object
     Name :  Balram
     Balance : 20.0    */
	}
}
