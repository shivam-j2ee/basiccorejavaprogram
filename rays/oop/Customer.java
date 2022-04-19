package in.co.rays.oop;

//Deep Cloning
public class Customer implements Cloneable{
	public String name = null;
	public BankAccount account = null;
	
	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
	}
	
	public Object clone() throws CloneNotSupportedException {
		Customer c =(Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c1 = new Customer("Shreya");
		Customer c2 = (Customer) c1.clone();
		c2.name = "Dixit";
		c2.account.balance = 20;
		
		System.out.println("Original is");
		System.out.println("Name is "+c1.name);
		System.out.println("Balance is "+c1.account.balance);
		
		System.out.println("Clone is");
		System.out.println("Name is "+c2.name);
		System.out.println("Balance is "+c2.account.balance);

	}

}
