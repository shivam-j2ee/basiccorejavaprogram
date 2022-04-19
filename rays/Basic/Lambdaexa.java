package in.co.rays.Basic;
interface Addable{
	public int add (int a, int b);

}

public class Lambdaexa {
public static void main(String[] args) {
		
		Addable a1 = ( a,b)->{
			
			return a+b;
		};
		System.out.println(a1.add(10, 30));
	}
	

}
  