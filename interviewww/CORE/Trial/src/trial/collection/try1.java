package trial.collection;

import java.util.PriorityQueue;

public class try1 {
	public static void main(String[] args){
		//classcastException..
	  	PriorityQueue p = new PriorityQueue();
		p.add(1);
		p.add(2.3);
		p.add(6);
		p.add('A');
		System.out.println(p);
	}

}
