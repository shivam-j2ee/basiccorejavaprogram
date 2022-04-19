package in.co.rays.Basic;

public class P3 {
	public static void main(String[] args) {
		int no=4;
		int co=no-1;
		for(int i=1;i<=no;i++){
			for(int j=1;j<=co;j++){
				System.out.print(" ");
			}
				for(int k=1;k<=2*i-1;k++){
					System.out.print("*");
				
				}
				System.out.println("");
			
				co--;
		}
		/*int a=1;
		for(int i=no-1;i>=1;i--){
			for(int j=1;j<=a;j++){
				System.out.print(" ");
	
			}
			for(int k=2*i-1;k>=1;k--){
				System.out.print("*");
			}
			System.out.println("");
			a++;
		}*/
		
	}

}
