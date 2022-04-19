package exception.basic;

public class FamilyPropogationUnchecked {
	
	public static void dad() {
		try{
			mom();
		}catch(PropagationException e) {
			e.printStackTrace();
		}
		}
	
	
	public static void mom() {
		son();
	}
	
	public static void son() {
		PropagationException e=new PropagationException("this is exception");
		throw e;
	}
	
public static void main(String[] args) {
	dad();
}
}
