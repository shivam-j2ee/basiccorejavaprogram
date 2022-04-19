package in.rays.OOP.Polymorphism.MethodArguements;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] s = new Shape[2];
		
		s[0]= new Circle();
		s[1]= new Rectangle();
		
		
		double d = calArea(s);
		
		System.out.println(d);
	}
	
	
	public static double calArea(Shape[] s){
		
		  double tot =0;
		  
		  for(int i=0;i<s.length;i++){
			  
			  tot = tot+s[i].area();
		  }
		
		return tot;
	}

}
