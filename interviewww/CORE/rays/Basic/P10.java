package in.co.rays.Basic;

public class P10{
	public static void main(String[] args) {     //* * *
		                                        //  * *
		for (int i = 3; i>=1; i--) {          //     *
			for (int k =3-1; k >=i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.print("\n");
		}
	}

}
