package in.co.rays.Basic;

public class Secondlarge {
	public static void main(String[] args) {
		int []a={11,22,55,99,33,44,66,75};
		int large=a[0];
		int secondLarge=0;
		int third = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]>large){
				third = secondLarge;
				secondLarge=large;
				large=a[i];
				
			}
			if(a[i]<large && a[i]>secondLarge){
				third = secondLarge;
				secondLarge=a[i];
			}if(a[i]<secondLarge && a[i]>third){
				third = a[i];
			}
		}
		System.out.println(secondLarge);
		System.err.println(third);
	}

}

