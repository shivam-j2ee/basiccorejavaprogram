package in.co.rays.oop;

public class Compiletime {
	
public void disp(int num){
	System.out.println(num);
}
public void disp(int num1,int num2){
	System.out.println(num1+" "+num2);
}
public double disp (double num){
	System.out.println(num);
	return num;
}
public static void main(String[] args) {
	Compiletime c = new Compiletime();
	/*double result;*/
	c.disp(40);
	c.disp(12, 22);
	/*result =*/ c.disp(5.1);
	
	/*System.out.println(result);
	System.out.println(c.disp(5.1));*/
}
}
