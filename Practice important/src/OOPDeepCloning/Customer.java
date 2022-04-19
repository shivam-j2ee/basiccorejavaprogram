package OOPDeepCloning;

public class Customer implements Cloneable
{
  public String name = null;
  public BankAccount account=null;
  
	public Customer(String n) 
	{
     name = n;
     account = new BankAccount(10);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		Customer c = (Customer) super.clone();
		c.account = (BankAccount)account.clone();
		return c;
	}
}
