package Basic.Repeat;

public class MissingEle {
public static void main(String[] args) {
	int a[]= {2,4,5,6,3};
	int b[]= {4,2,3,1,7};
	
	for(int i=0;i<a.length;i++) {
		boolean flag=true;
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
				flag=false;
			}
		}
			if(flag==true) {
				System.out.println(a[i]);
				System.out.println(b[i]);
			}
		
	}
}
}
