package in.co.rays.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Bajrangi BhaiJaan";
	
		for (int i =str.length()-1; i>=0; i--) {
			
			System.out.print(str.charAt(i));
		}
	}
}
