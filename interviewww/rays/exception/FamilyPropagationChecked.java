package in.co.rays.exception;

public class FamilyPropagationChecked {

	public static void main(String[] args) {
		dad();
	}
	
	public static void dad() {
		try {
		mom();
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void mom() throws CustomException {
		son();
	}
	
	public static void son() throws CustomException{
		
		CustomException e = new CustomException("This is Custom Exception");
		throw e;
	}
}
