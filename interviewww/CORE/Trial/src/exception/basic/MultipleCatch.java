package exception.basic;

public class MultipleCatch {

	public static void main(String[] args) {
		String name=null;
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(5));
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.exit(3);

		}finally {
			System.out.println("finally block");
		}
	}
	}

