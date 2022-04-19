 package in.co.rays.Basic;

public class Random {
	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			//System.out.println((int)(Math.random()*(100)));
			
			int rando = 1000-(int)(Math.random()*(500));
			System.out.println(rando);
		}
	}

}
