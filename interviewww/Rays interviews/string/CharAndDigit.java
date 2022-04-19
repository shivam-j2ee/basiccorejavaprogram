package in.co.rays.string;

public class CharAndDigit {
	
	public static void main(String [] args){
		
		String str = "1503 Siddharth96";
		int letter =0;
		int space = 0;
		int number = 0;
		
		for(int i=0; i<str.length();i++){
			if(Character.isLetter(str.charAt(i))){
				letter++;
			}
			if(Character.isDigit(str.charAt(i))){
				number++;
			}
			if(Character.isSpace(str.charAt(i))){
				space++;
			}
		}
		System.out.println(letter);
		System.out.println(number);
		System.out.println(space);
	}

}
