package Exception;

public class CheckedPropogation 
{
	public static void main(String[] args)
	{
		dad();
	}

	private static void dad() 
	{
		try {
			mom();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void mom() throws CustomChecked 
	{
	  son();
	}

	private static void son() throws CustomChecked 
	{
		CustomChecked c = new CustomChecked("This is Custom Checked Exception");
		throw c;
	}
}
