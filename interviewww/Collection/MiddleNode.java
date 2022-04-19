package extr;

import java.util.ArrayList;
import java.util.LinkedList;

public class MiddleNode {
public static void main(String[] args) {
	
	//LinkedList c = new LinkedList();
	ArrayList c = new ArrayList();
	c.add("Ram");
	c.add("afroj");
	c.add("julie");
	c.add("faisal");
	c.add("Shabana");
	c.add("Sh");

	int size = c.size();
	
	int middleNode = (int)size/2;
	
	System.out.println(c.get(middleNode));
}
}
