package in.co.rays.Basic;

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
	System.err.println("Number is");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	if(num%2==0){
		System.out.println(num+"No is Even");
	}else{
		System.out.println(num+" No is odd");
	}
}
}
