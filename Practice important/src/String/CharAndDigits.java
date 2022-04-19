package String;

public class CharAndDigits 
{
	public static void main(String[] args)
	{
     String str = "1503 Siddharth96";
     
     int letter=0 , number=0 , space=0;
     
		for (int i = 0; i < str.length(); i++) 
		{
			if (Character.isLetter(str.charAt(i))) {
				letter++;
			}
			if (Character.isDigit(str.charAt(i))) {
				number++;
			}
			if (Character.isSpaceChar(str.charAt(i))) {
				space++;
			}
		}
      System.out.println("Letters "+letter);
      System.out.println("number "+number);
      System.out.println("space "+space);
	}
}
