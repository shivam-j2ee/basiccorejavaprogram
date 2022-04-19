package trial.collection;

import java.util.ArrayList;

public class MiddleNode {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	a.add(6);
	a.add(7);
	a.add(8);
	a.add(9);
	
	int size=a.size();
	//System.out.println(size);
	
	int middleNode=(int)size/2; 
	if(size%2==0) {
		System.out.println(a.get(middleNode-1));
	}else {
		System.out.println(a.get(middleNode));
	}
}
}
