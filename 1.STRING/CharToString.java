package in.co.rays.string;

public class CharToString {

	public static void main (String [] args){
		
		char [] chr = {'a','b','c','d','f'};
		
		char c;
		String s= new String();
		for (int i = 0; i < chr.length; i++) {
			c=chr[i];
			s=s+String.valueOf(c);
			
		}
		System.out.println(s);
	}
}





output:-
	abcd