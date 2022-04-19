package Exception;

import JavaBasics.fibonacci;

public class MultiCatch 
{
	public static void main(String[] args) 
	{
      String name = "Ram";
      
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}catch (Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Always Executed");
		}
	}
}
