package in.rays.OOP.InterfaceOverriding;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bank ob = new Bank(){
			
			public double interestRate(){
				
				return 7.0;
			}
		};
		
		
		System.out.println("interest rate "+ob.interestRate());
	}

}
