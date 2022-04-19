package Exception;

public class UnCheckedPropogation 
{
	public static void main(String[] args) 
	{
     dad();
	}

	private static void dad() 
	{
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void mom() 
	{
		son();
	}

	private static void son() 
	{
		CustomUnChecked c = new CustomUnChecked("This is Custom Unchecked Exception");
		throw c;
	}
}
