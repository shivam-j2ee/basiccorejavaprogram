package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Test {


	public static void main(String[] args) {
		
		SallerySorting s = new SallerySorting();
		
		SallerySorting s1 = new SallerySorting(20000,"ram");
		SallerySorting s2 = new SallerySorting(40000,"shyam");
		SallerySorting s3 = new SallerySorting(11000,"dhamu");
		
		ArrayList al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al,s);
		
		for(Object ob :al){
			System.out.println(ob);
		}
}}
