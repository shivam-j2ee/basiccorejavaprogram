package in.co.rays.exception;

public class FamilyPropagationUnchecked {
	public static void main(String[] args) {
		dad();
	}
	
	public static void dad() {
		try {
		mom();
		}
		catch(PropagationException p) {
p.printStackTrace();			
		}
	}
	
	public static void mom() {
		son();
	}
	
	public static void son() {
		
		PropagationException e = new PropagationException("This is pp Exception");
		throw e;
	}
}


