package exception.basic;

public class FamilyPropogationChecked {
	
	public static void dad() {
		try {
	mom();
		}catch(CustomException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void mom() throws CustomException{
		son();
	}
	
	public static void son() throws CustomException{
		CustomException e=new CustomException("this is exception");
		throw e;
	}
	
	public static void main(String[] args) {
		dad();
	}

}
