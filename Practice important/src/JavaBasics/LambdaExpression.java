package JavaBasics;

public class LambdaExpression 
{
public static void main(String[] args) {
		
		Addable a1 = ( a,b)->{
			
			return a+b;
		};
		System.out.println(a1.add(10, 30));
       
	}
}
