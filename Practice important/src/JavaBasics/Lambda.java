package JavaBasics;

interface Addable2{
	public int add(int a,int b);
	 default void sub(){
		 System.out.println("this is sub");
		 
	 }
	 public static void multi(){
		 System.out.println("this is multi");
	 }
}

public class Lambda 
{
public static void main(String[] args) {
		
	lamExa e=(a,b)->{ 
		/*if(a>b){
			return  a;
			}else{
				return b;
			}*/
		return a+b;
	};
	
	System.out.println(e.add(10, 20));
	e.sub();
	lamExa.multi();
	}
}
