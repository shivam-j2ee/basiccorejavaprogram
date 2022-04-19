package trial.io;

import java.util.Scanner;

public class ScannerAdd {
public static void main(String[] args) {
	int a,b;
	
	System.out.println("enter value of a and b");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	
	int c=a+b;
	System.out.println(c);
}
}
