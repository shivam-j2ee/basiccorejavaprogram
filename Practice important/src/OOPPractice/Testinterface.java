package OOPPractice;

public class Testinterface 
{
	public static void main(String[] args) 
	{
     Bank b1 = new ICICI();
     Bank b2 = new SBI();
     
     System.out.println("ICICI   "+b1.rateOfInterest());
     System.out.println("SBI   "+b2.rateOfInterest());
	}
}
