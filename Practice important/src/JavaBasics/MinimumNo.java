package JavaBasics;

public class MinimumNo {

	public static void main(String[] args) {
		
	
	int i =70;
	int j=80;
	
	int minresult = (i<j)?i:j;
	int maxresult = (i>j)?i:j;
	
	System.out.println(minresult);
	System.out.println(maxresult);
	
	if(i>j){
		System.out.println("-------"+i);
	}else{
		System.out.println("----"+j);
	}

	String even =(i%2==0)?"even":"odd";
	System.out.println("=eve="+even);
	}
}
