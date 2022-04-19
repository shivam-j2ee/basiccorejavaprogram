package in.co.rays.string;

public class VowelCount {

	public static void main(String[] args) {

		String s="Sonali";
		
	int k=0;	 
		 int i=0;
		 int a=0;
		 int e=0;
		 int o =0;
		 int u=0;
		 
		 for (int i1 = 0; i1 < s.length(); i1++) {
			 
			char ch= s.charAt(i1);
			
			if(ch == 'a'){
				a++;
			}if(ch =='e'){
				e++;
			}if(ch =='i'){
				i++;
			}if(ch =='o'){
				o++;
			}if(ch =='u'){
				u++;
			} else{
				
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
