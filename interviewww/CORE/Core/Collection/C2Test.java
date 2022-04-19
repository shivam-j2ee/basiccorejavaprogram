package com.raystech.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C2Test {

	public static void main(String[] args) {

		C2 c = new C2();
		List l = new ArrayList<>();
		l.add(new C2("Hukum","Chandra","Pal",24));
		l.add(new C2("Hukum","Chand","Pal",20));
		l.add(new C2("Hukum","Singh","Sair",17));
		l.add(new C2("Hukum","Singh","Pal",28));
		
		Collections.sort(l,c);
		
		for(Object o:l)
		System.out.println(o);
	}

}
