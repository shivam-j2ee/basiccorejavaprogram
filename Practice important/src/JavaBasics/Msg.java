package JavaBasics;

interface lamExa{
	 int add(int a,int b);
	 default void sub(){
		 System.out.println("this is sub"); 
	 }
	 public static void multi(){
		 System.out.println("this is multi");
	 }
}
public class Msg {
	public static void main(String[] args) {
		lamExa e=(a,b)->{ 
			return a+b;
		};
		System.out.println(e.add(10, 20));
		e.sub();
		lamExa.multi();
	}
	

}