package OOP;

public class BankAccount implements Cloneable
{
	public double balance=0;
	
    public BankAccount(double b)
    {
	  balance = b;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
     BankAccount b1 = new BankAccount(10);
     BankAccount b2 =(BankAccount)b1.clone();
     System.out.println("----"+b2.balance);
     b2.balance = 20;
     
     System.out.println(b1.balance);
     System.out.println(b2.balance);
	}
	
}
