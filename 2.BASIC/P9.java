package in.co.rays.Basic;

public class P9 {
    public static void main(String[] args) {        // *
    	                                           // * *                          
    	for (int i = 1; i<=5; i++) {              // * * *
    		for (int k = 5-1; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}
