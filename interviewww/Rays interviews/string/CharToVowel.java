package in.co.rays.string;

public class CharToVowel {
	public static void main(String[] args) {
		String name="Jai shree Mahakal";
		
		
		int j=0;
		int k=0;
		for(int i=0;i<name.length();i++){
			char ch=name.charAt(i);
			
			if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
				k++;
			}
			else{
				j++;
			}
		}
		System.out.println("Vovels= " +k);
		System.out.println("Charc" +j);
	}

}
