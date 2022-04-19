package in.co.rays.Basic;

public class SecondHigestNumber {
	public static void main(String[] args) {
		int a[]={1,2,3,4,10,9,20,5,55,23};
		int higest=0,secondigest=0;
		for(int num:a){
			if(higest<num){
				secondigest=higest;
				higest=num;
			}else if(secondigest<num){
				secondigest=num;
			}
		}
		System.out.println("higest number = "+higest);
		System.out.println(" Second higest number = "+secondigest);
	}

}

