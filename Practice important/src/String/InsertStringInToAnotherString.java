package String;

public class InsertStringInToAnotherString 
{
	public static void main(String[] args) 
	{
		String originalString = "GeeksGeeks";
		String stringToBeInserted = "For";
		int index = 4;
    
		String sFinal = "";
		
		for (int i = 0; i < originalString.length(); i++) 
		{
			sFinal = sFinal+originalString.charAt(i);
			
          if(i==index)
          {
        	 sFinal = sFinal+stringToBeInserted; 
          }
		}
		System.out.println(sFinal);
	}
}
