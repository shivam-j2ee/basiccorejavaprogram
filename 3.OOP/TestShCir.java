package com.raystech.OOP;

public class TestShCir {

	public static void main(String[] args) {

		/*Sh[] s = new Sh[2];
		s[0]= new Cir();
		s[1] = new Rect();*/
		
		/*double total =totalArea(s);
		System.out.println(total);*/
    	 
		Sh s1 =  getShape(1);
		System.out.println(s1.area());
		
		Sh s2 = getShape(2);
		System.out.println(s2.area());
		
		/*double total=0;
    	 for(int i=0;i<s.length;i++){
    		 total = s[i].area();
    		 System.out.println(total);
    	 }*/
     }
	public static Sh getShape(int i){
		if(i==1){
			return new Cir();
		}
		if(i==2){
			return new Rect();
		}
		
		return null;
	}
	
}
