
public class CountVowelNCharacter {
public static void main(String[] args) {
	String s="sunrays";
	
	int j=0;
	int k=0;
	
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			k++;
		}else {
			j++;
		}
	}
	System.out.println("Vowels" +k);
	System.out.println("character" +j);
}
}
