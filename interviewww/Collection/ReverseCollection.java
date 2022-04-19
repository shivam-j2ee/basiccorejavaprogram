package extr;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseCollection {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
	}

}
