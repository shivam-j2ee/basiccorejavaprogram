package Basic;

public class Test {
	public static void main(String[] args) {
		sum();
	}
		public static void sum() {
			try {
				String s= "Ranu";
				s.charAt(5);
				s.length();
			}catch(NullPointerException e) {
				e.printStackTrace();
				System.out.println("Ranu");
			}
			catch(StringIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("Gupta");
			}
		
		finally{
			System.out.println("hi");
		}
		}

}
