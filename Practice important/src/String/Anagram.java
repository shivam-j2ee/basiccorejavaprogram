package String;


public class Anagram 
{
	public static void main(String[] args) 
	{
     String s1 = "TRIANGLE";
     String s2 = "INTEGRAL";
     
     int count=0;
     
		for (int i = 0; i < s1.length(); i++) 
		{
			char c = s1.charAt(i);
			
			if(!s1.substring(0, i).contains(c+""))
			{
				for (int j = 0; j < s2.length(); j++) 
				{
	              if(c==s2.charAt(j))
	              {
	            	 count++; 
	              }	
			    }
		    }
		}
		
		if(s1.length()==count)
		{
			System.out.println("This is Anagram Series");	
		}else
		{
			System.out.println("This is not Anagram Series");
		}
     
	}
}
