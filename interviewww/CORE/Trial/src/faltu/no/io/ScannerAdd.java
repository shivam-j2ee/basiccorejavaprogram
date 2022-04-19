package faltu.no.io;

import java.util.Scanner;

public class ScannerAdd {
public static void main(String[] args) {
	int a,b,c;
	System.out.println("enter value of a and b");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println(c);
}
}
