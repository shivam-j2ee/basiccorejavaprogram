package String;

public class ArrayToString
{
	public static void main(String[] args) 
	{
		//Swapping
     /*String s1 = "Rahul";
     String s2 = "Sirwani";
     
     s1 = s1+s2;
     
     s2 = s1.substring(0,s1.length()-s2.length());
     
     s1 = s1.substring(s2.length());
     
     System.out.println("s1--->"+s1);
     System.out.println("s2--->"+s2);*/
     
		//Character And Digits
		/*String str = "1503 Siddharth96";
		
		int letterCount = 0 , digitCount=0 , spaceCount=0;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isDigit(str.charAt(i))) 
			{
				digitCount++;
			}
			if (Character.isLetter(str.charAt(i))) 
			{
				letterCount++;
			}
			if (Character.isSpaceChar(str.charAt(i))) 
			{
				spaceCount++;
			}
		}
		System.out.println("No of Character-->"+letterCount);
		System.out.println("No of Digits-->"+digitCount);
		System.out.println("No of Space-->"+spaceCount);*/
		
		//All Character Count
		
		/*String s="Rahul Sirwani";
		
		int count=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			count=0;
           if(!s.substring(0, i).contains(s.charAt(i)+""))
           {
				for (int j = i; j < s.length(); j++) 
				{
                  if(s.charAt(i)==s.charAt(j))
                  {
                	  count++;
                  }
				}
				System.out.println("Character "+s.charAt(i)+" occurs "+count+" times");
           }
           
		}*/
		
		//Character And Vowel
		
		/*String s = "RahulSirwani";
		
		int charCount=0, vowelCount=0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
          if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
          {
        	vowelCount++;  
          }else
          {
        	  charCount++;
          }
		}
		System.out.println("Total Characters are "+charCount);
		System.out.println("Total Vowel are "+vowelCount);*/
		
		//Character to String
		
		/*char[] ch ={'R','a','h','u','l'};
		String s="";
		
		for (int i = 0; i < ch.length; i++) 
		{
          s=s+String.valueOf(ch[i]);
		}
		System.out.println(s);*/
		
		//Concate two ways
		
		/*String fname = "Rahul";
		String lname = "Sirwani";
		
		System.out.println(fname.concat(lname));
		System.out.println(fname+lname);*/
		
		//Extract Last
		
		/*String s = "Rahul Sirwani";
		
		String[] s1 = s.split(" ");
		
		System.out.println("Last word is--->"+s1[s1.length-1]);*/
	
		//Palindrom
		
		/*String s = "Madam" , s1 ="";
		
		for (int i = s.length() - 1; i >=0; i--) 
		{
         s1 = s1+s.charAt(i);
		}
		System.out.println(s1);
		if(s1.equalsIgnoreCase(s))
		{
			System.out.println("This is Palindrom Number");
		}else
		{
			System.out.println("This is Not Palindrom Number");
		}*/
		
		//Replace And ReplaceAll
		
		/*String s = "Rahul Sirwani";
		
		System.out.println(s.replace('a', '@'));
		System.out.println(s.replaceAll("[ih]", "#"));*/
		
	}
}
