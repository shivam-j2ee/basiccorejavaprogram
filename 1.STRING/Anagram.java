package string;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "SILENT";
		String s1 = "LISTEN";
		
		int count = 0;
		
		for(int i=0 ; i<s.length() ; i++){
				char ch = s.charAt(i);
			
			for(int j=0 ; j<s1.length();j++){
				if(ch==s1.charAt(j)){
					count++;
				}
			}
		}
		
		if(count==s.length()){
			System.out.println("this is anagram");
		}
		else{
			System.out.println("this is not an anagram");
		}
	}

}
