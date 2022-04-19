package OOPDeepCloning;

public class BankAccount implements Cloneable
{
  public double balance = 0;
  
	public BankAccount(double b) 
	{
     balance = b;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
      BankAccount b1= new BankAccount(10);
      BankAccount b2 = (BankAccount)b1.clone();
	}
}
