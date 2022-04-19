package JavaBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

interface AddNew 
{
  public int add(int a, int b);
 
  default void sub(){
		 System.out.println("this is Practice sub");
		 
	 }
	 public static void multi(){
		 System.out.println("this is Practice multi");
	 }
}


public class Practice 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException 
	{
      //Ranadom Number between 100-200
		
		/*int max=200;
		int min=100;
		
		for (int i = 0; i < 5; i++) 
		{
          int no = (int) ((Math.random()*(max-min))+min);
          System.out.println(no);
		}*/
		
		//Armstrong Number
		
		 /*int no = 153;
		 int temp = no;
		 int sum = 0;
		  
		while (no > 0) 
		{
         int a = no%10;
         sum = sum+a*a*a;
         no = no/10;
		}
		 if(sum==temp)
		 {
			 System.out.println("This no is Armstrong");
		 }else
		 {
			 System.out.println("This no is not Armstrong");
		 }*/
		 
		 //Prime No (No which divisible by only 1 or self)
		
		  /*int no = 18;
		  int count=0;
		  
		  for (int i = 2; i < no / 2; i++)
		  {
			if (no % i == 0) 
			{
				count++;
				break;
			} else 
			{
				count = 0;
			}
		  }
		  if (count == 0)
		  {
			System.out.println("This is Prime No");
		  } else 
		  {
			System.out.println("This is not Prime No");
		  }*/
		
		//AutoBoxing
		
		 /*int i=10;
		 Integer a = i;
		 int no = a;
		 System.out.println(i);
		 System.out.println(a);
		 System.out.println(no);*/
		 
		//Bubble Sort
		
		/*int[] a = {10,50,60,9,5,80,6};
		int temp;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{
              if(a[i]>a[j])
              {
            	 temp = a[j]; 
            	 a[j]=a[i];
            	 a[i]=temp;
              }
			}
		}
		for (int k = 0; k < a.length; k++) 
		{
         System.out.print(a[k]+" ");
		}*/
		  
		//Third largest No
		
		/*int[] a = {10,50,60,9,5,80,6};
		int temp;
		
		//First Arrange in Accending order
		for (int i = 0; i < a.length; i++) 
		{
			for (int j =i+1; j < a.length; j++) 
			{
              if(a[i]>a[j])
              {
            	  temp =a[j];
                  a[j] = a[i];
                  a[i] = temp;
              }
			}
		}
		for (int k = 0; k < a.length; k++) 
		{
         System.out.print(a[k]+" ");
		}
		System.out.println();
		
		//Now find Third Largest Number
		System.out.println(a[a.length-3]);*/
		
		//Factorial
		
		/*int no = 4;
		int temp = 1;
		
		for (int i = 1; i <= no; i++) 
		{
         temp = temp*i;
		}
		System.out.println(temp);*/
		
		//Factory Method
		
		/*Practice pc = pm.getInstance();
		System.out.println(pc);*/
		
		//Harmonic Series
		
		/*int no = 6;
		double sum=0.0;
		
		for (int i = 1; i <= no; i++) 
		{
          sum = sum+(double)1/i;
		}
		System.out.println(sum);*/
		
		//Fibonacci Series
		
		/*int a=0;
		int b=1;
		int n=10;
		int c=0;
		
		for (int k = 0; k < n; k++) 
		{
          c=a+b;
          a=b;
          b=c;
          System.out.print(c+" ");
		}*/
		
		//Lambda Expression
		
		/*AddNew an = (a,b)->{
			
			return a+b;
		};
		System.out.println(an.add(10, 20));
		an.sub();
		AddNew.multi();*/
		
		//Missing Numbers
		
		/*int[] a = {10,50,6,5,9};
		int[] b = {10,5,9,1,2};
		
		for (int i = 0; i < a.length; i++) 
		{
			boolean flag = true;
			for (int j = 0; j < b.length; j++) 
			{
               if(a[i]==b[j])
               {
            	   flag = false;
               }
			}
			if(flag == true)
			{
				System.out.println(a[i]);
			}
		}*/
		
		//Object Creation 5 Ways(How Many ways to create an Object)
		
		/*//1
		Practice p1 = new Practice();*/
		
		/*//2
		Practice p2 = (Practice) Class.forName("JavaBasics.Practice").newInstance();
		*/
		
		/*//3
		Constructor cons = Practice.class.getConstructor();
		Practice p3 = (Practice) cons.newInstance();*/
		
		/*//4
		Practice obj = new Practice();
		Practice p4 = (Practice) obj.clone();*/
		
		/*//5
		FileInputStream on = new FileInputStream("");
		ObjectInputStream in = new ObjectInputStream(on); 
		Practice p5 = (Practice) in.readObject();*/
		
		//Reverse Number
		
		/*int no = 1234;
		int result = 0;
		
		while(no>0)
		{
		  int a = no%10;
		  result = result*10+a;
		  no = no/10;
		}
		System.out.println(result);*/
		
		//Palindrom Number
		
		/*int no = 212;
		int temp = no;
		int res = 0;
		
		while(no>0)
		{
		   int a = no%10;
		   res = res*10+a;
		   no=no/10;
		}
		if(temp==res)
		{
			System.out.println("No is Palindrom");
		}else
		{
			System.out.println("No is not Palindrom");
		}*/
		
		//Random
		
		/*for (int i = 1; i <=5; i++) {
			//System.out.println((int)(Math.random()*(100)));
			
			//Random No from 500 to 1000
			int rando = 1000-(int)(Math.random()*(500));
			System.out.println(rando);
		}*/
		
		int[] a = {11,15,2,9,5,3,7};
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{
                 if(a[i]>a[j])
                 {
                	 temp = a[j];
                	 a[j] = a[i];
                	 a[i] = temp;
                 }
			}
		}
		System.out.print("{");
		for (int k = 0; k < a.length; k++) 
		{
          System.out.print(a[k]+" ");
		}
		System.out.print("}");
	}
	public static Practice pm;
	
	public static Practice getInstance()
	{
		if(pm==null)
		{
		  pm = new Practice();
		  System.out.println("Factory Method practice called");
		}
		return pm;
	}
}
