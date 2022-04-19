  package Basic.Repeat;

public class SecLrgArr {
public static void main(String[] args) {
	int[] a= {4,22,12,8};
	int fmax,smax,temp;
	fmax=smax=a[0];
	
	for(int i=0;i<a.length;i++) {
		if(fmax<a[i]) {
			temp=smax;
			smax=fmax;
			fmax=a[i];
		}else if(smax<a[i]){
			temp=smax;
			smax=a[i];
		}
	}System.out.println(fmax +" "+smax);
}
}
