package in.co.rays.string;

public class Occurance {
	public static void main(String[] args) {
		String s="Siddharth Jain ";
		int count=0;
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='i'){
			count++;
		}
		}
		System.out.println("Count "+count);
		
	}

}
