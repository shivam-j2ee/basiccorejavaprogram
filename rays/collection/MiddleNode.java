package in.co.rays.collection;

import java.util.ArrayList;

public class MiddleNode {
public static void main(String[] args) {
	
	//LinkedList c = new LinkedList();
	ArrayList c = new ArrayList();
	c.add("Ram");
	c.add("afroj");
	c.add("julie");
	c.add("faisal");
	c.add("Shabana");
	c.add(12);
	c.add(3);
/**	c.add("Sh");
	c.add("Shreya");
	c.add("Shivani");
	c.add("Shikha");*/
	int size = c.size();
	
	int middleNode = (int)size/2;
	
	if(size%2==0){
		System.out.println(c.get(middleNode-1));
	}else{
		System.out.println(c.get(middleNode));
	}
	
	//System.out.println(c.get(middleNode));
}
}