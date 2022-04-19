package in.co.rays.exception;
public class MultiCatch {
	
	public static void main(String[] args) {
		
		String name = "Ram";
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));
			
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
		
			
		}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Always Executed");
			/*try {
				System.out.println(name.length());
			} catch (ArithmeticException e2) {
                e2.printStackTrace();			}*/
		}
	}
}