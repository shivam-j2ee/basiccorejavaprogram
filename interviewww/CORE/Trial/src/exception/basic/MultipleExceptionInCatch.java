package exception.basic;

public class MultipleExceptionInCatch {

	

		public static void main(String[] args) {
			String name="shah";
			
			try {
				System.out.println(name.length());
				System.out.println(name.charAt(5));
			}catch(NullPointerException | StringIndexOutOfBoundsException e){
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
		}
		}


