package com.raystech.OOP.TestOOPPrograms;

  class TestMO2 {

	public static void main(String[] args) {

	    TestMO1 m = new TestMO1();
	    
	    System.out.println(m.add(1.2, 1.2f));
	    System.out.println(m.add((int)1.2, (int)1.2f));
	    System.out.println(m.add((int)1.2, (int)1.2));
	    
	    
	    
	    System.out.println(m.add(12, 12));
	    System.out.println(m.add(12, 12, 12));
	    
	    
	    System.out.println(m.add(12, 1.2f));
	    System.out.println(m.add(12, (int)1.2));
		
		
	}

}
