
public class SToChar {

	public static void main(String[] args) {
   String a="vaishali";
   String b="shah";
  
   a=a+b;
    b=a.substring(0,a.length()-b.length());
    a=a.substring(b.length());
    
    
   
   System.out.println(a+" "+b);
	}
}

