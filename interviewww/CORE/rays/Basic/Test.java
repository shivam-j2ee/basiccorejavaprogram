package in.co.rays.Basic;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		 int a[] = {11,22,33,44,55,66,77,88,99,4,3,2,1,5};
		 
		 int largest=a[0];
		 int secondlargest=0;
		 int thirdlargest=0;
		 
		 for (int i = 0; i < a.length; i++)
		 {
		        /*Scanner input = new Scanner(System.in);*/
				/*a[i] = input.nextInt();*/
		        if (largest < a[i]) {
		            secondlargest = largest;
		            largest = a[i];
		            continue;
		        }
		        if (secondlargest <= a[i] && largest > a[i])
		        {
		            thirdlargest = secondlargest;
		            secondlargest = a[i];
		            continue;
		        }
		        if (thirdlargest <= a[i] && secondlargest > a[i])
		        {
		                thirdlargest = a[i];
		        }

		 }
		 System.out.println(thirdlargest);
	}

}
