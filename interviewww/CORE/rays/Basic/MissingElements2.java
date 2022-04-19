package in.co.rays.Basic;
public class MissingElements2{
public static void main(String[] args) {
	
	int[] a = {2,4,6,8,10,11,55,66};
	int[] b = {3,6,8,9,12,88,11,66};
	
	for (int i = 0; i < a.length; i++) {
		boolean flag = true;
		for (int j = 0; j < b.length; j++) {
			
			if(a[i]==b[j]){
				flag = false;
				break;
				
			}
		}
		if (flag==true) {
			System.out.println("a="+a[i]);
		}}
		for (int j = 0; j < b.length; j++) {
			boolean flag = true;
			for (int i = 0; i < a.length; i++) {
				if (b[j]==a[i]) {
					flag=false;
					
				}
			}
			if (flag ==true) {
				System.out.println("b ="+b[j]);
			}
		}
	}

	
}


