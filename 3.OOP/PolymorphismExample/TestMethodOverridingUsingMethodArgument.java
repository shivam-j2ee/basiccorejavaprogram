package com.raystech.OOP.PolymorphismExample;

public class TestMethodOverridingUsingMethodArgument {

	public static void main(String[] args) {

		/*ShapeMethodOverridingUsingMethodArgument[] s = new ShapeMethodOverridingUsingMethodArgument[2];
		s[0] = new CircleUsingMethodArgument();
		s[1] = new RectangleUsingMethodArgument();*/
	
		ShapeMethodOverridingUsingMethodArgument s1 = getShape(1);
		  System.out.println(s1.area());
		
		   ShapeMethodOverridingUsingMethodArgument s2 = getShape(2);
		   System.out.println(s2.area());
		
		/*double total = totalArea(s);
		
		//double total = 0;
		
		//System.out.println(total);
	}

	public static double totalArea(ShapeMethodOverridingUsingMethodArgument[]s){
		double total=0;
		for(int i=0;i<s.length;i++){
		
		total = total+s[i].area();
		//System.out.println(total);
		
	}
	return total;*/
	
  }
	public static ShapeMethodOverridingUsingMethodArgument getShape(int i){
		if(i==1){ return new CircleUsingMethodArgument();}
		if(i==2){ return new RectangleUsingMethodArgument();}
		return null;
		
	}
 
}