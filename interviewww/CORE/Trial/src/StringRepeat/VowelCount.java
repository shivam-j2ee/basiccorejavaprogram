package StringRepeat;

public class VowelCount {
public static void main(String[] args) {
	String s="vaishali";
	int k=0;
	int a=0;
	int e=0;
	int i=0;
	int o=0;
	int u=0;
	
	
	for(int j=0;j<s.length();j++) {
		char c=s.charAt(j);
		if(c=='a') {
			a++;
		}if(c=='e') {
			e++;
		}if(c=='i') {
			i++;
		}if(c=='o') {
			o++;
		}if(c=='u') {
			u++;
		}else {
			k++;
		}
	}
	System.out.println(a);
	System.out.println(e);
	System.out.println(i);
	System.out.println(o);
	System.out.println(u);
	System.out.println(k);

}
}
