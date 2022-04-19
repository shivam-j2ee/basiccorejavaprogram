package StringRepeat;

public class New{
	
	public static void misEle(int[] a,int[] b) {
		boolean flag=true;
		
		for(int i=0;i<a.length;i++) {
			flag=true;
			
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					flag=false;
					//break;
				}
			}
			if(flag==true) {
				System.out.println(a[i]);
			}
		}
	}
	
public static void main(String[] args){

	int[] a= {4,8,6,2,5,9};
	int[] b= {2,5,8,6,4,10};
	
	New.misEle(a, b);
	New.misEle(b, a);
	
}
}