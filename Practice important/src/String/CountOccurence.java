package String;

public class CountOccurence
{
	public static void main(String[] args) 
	{
      String s = "Jai Shree Mahakal";
      int a=0 , e=0 , i=0 , o=0 , u=0;
		for (int j = 0; j < s.length(); j++) 
		{
			char c = s.charAt(j);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
			{
                if(c=='a')
                {
                	a++;
                }if(c=='e')
                {
                	e++;
                }if(c=='i')
                {
                	i++;
                }if(c=='o')
                {
                	o++;
                }if(c=='u')
                {
                	u++;
                }
			}
		}
      System.out.println("a--->"+a);
      System.out.println("e--->"+e);
      System.out.println("i--->"+i);
      System.out.println("o--->"+o);
      System.out.println("u--->"+u);
	}
}
