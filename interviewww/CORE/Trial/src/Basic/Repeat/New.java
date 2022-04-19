package Basic.Repeat;

public class New {

	public static void main(String[] args) {
		int[] a= {4,5,7,8,12,14,14,1,4};
		int smax;int temp;
		int fmax=smax=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(fmax<a[i]) {
				 //temp=smax;
				smax=fmax;
				fmax=a[i];
			} if(smax<a[i] && fmax>a[i]) {
				//temp=smax;
				smax=a[i];
			}}
		System.out.println(smax);
	
	}
	}
