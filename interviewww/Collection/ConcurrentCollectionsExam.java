package extr;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentCollectionsExam {
	public static void main(String[] args) {

		/*PriorityQueue q = new PriorityQueue<>();
		
		BlockingQueue b = new BlockingQueue<E>() {
		};
		
		LinkedBlockingQueue l = new LinkedBlockingQueue<>();
		
		ConcurrentHashMap map  =new ConcurrentHashMap<>();
		
		ConcurrentMap ma = new ConcurrentMap<K, V>() {
		};
		
		ConcurrentNavigableMap m = new ConcurrentNavigableMap<K, V>() {
		};
		*/

		
//no duplicate,,follow order,no null,run remove
		
		ConcurrentHashMap map = new ConcurrentHashMap<>();
		map.put(3, "dxv");
		 map.putIfAbsent(1,"ram"); 
		 map.putIfAbsent(2, "Afroj");
		 map.putIfAbsent(22, "julie");
		
		System.out.println(map);
        //System.out.println(map.keySet());

		Iterator it = map.keySet().iterator();
		map.putIfAbsent(4, "ndmsbcjsd");
	
		while (it.hasNext()) {
		Object o = it.next();
		if(o.equals(3)){
			it.remove();
		}
		}
		System.out.println(map);

		
		//no duplicate,no null,follow order
		
	/*	ConcurrentSkipListMap ll = new ConcurrentSkipListMap<>();
		ll.put(1, "d");
		ll.put(2, "p");
		ll.put(2, "cjhk");
//		ll.put(null, "hdj");
		ll.putIfAbsent(3, "n");
	
		System.out.println(ll);
		
		Iterator it = ll.keySet().iterator();
		ll.put(4, "kdfsdufisuifudiuiuidssdc");
		while(it.hasNext()){
			Object o = it.next();
		}
		System.out.println(ll);
	*/	
		
		
		
		
		//duplicate allow ,null allow,follow order,no removve
		
/*		CopyOnWriteArrayList map = new CopyOnWriteArrayList<>();
		map.addIfAbsent(1);
		map.add(5);
		map.add(3);
		map.add(null);
		map.add(null);
	
		System.out.println(map);
		
		Iterator it = map.iterator();
		map.add("hgsdsdjkkhkjjkjkj");
	
		while (it.hasNext()) {
		Object o = it.next();
		if(o.equals(5)){   //this condition unsupported Operation exception
			it.remove();
		}
	
		}
		System.out.println(map);
*/		
		
		
		
		//does no duplicate,one null element,follow order,no remove
	
		/*CopyOnWriteArraySet map = new CopyOnWriteArraySet<>();
		
		map.add(null);
		map.add(null);
		map.add(2);
		map.add(5);	
		map.add(3);	
		map.add(4);	
		System.out.println(map);
		
		Iterator it = map.iterator();
		map.add("hgsdsdjkkhkjjkjkj");
	
		while (it.hasNext()) {
		Object o = it.next();
		
		if(o.equals(2)){      //exception unsupportedOperation exception
			it.remove();
		}
		
		}
		System.out.println(map);
*/		
		
		
		

		
		/*	       Enumeration it = map.elements();
			
	        map.putIfAbsent(4, "ndmsbcjsd");
		
			while (it.hasMoreElements()) {
			Object o = it.nextElement();
				System.out.println(o);
			}
			System.out.println(map);
*/
        
        
        
		
 }
}
