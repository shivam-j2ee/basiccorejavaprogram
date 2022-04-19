package Basic.Repeat;

public class ThirdLargArr {
	public static void main(String[] args) {
		
int[] a= {4,8,9,21,7};
int fmax,smax,tmax,temp;

fmax=smax=tmax=a[0];

for(int i=0;i<a.length;i++) {
	if(fmax<a[i]) {
		temp=tmax;
		tmax=smax;
		smax=fmax;
		fmax=a[i];
	}else if(smax<a[i]) {
		temp=tmax;
		tmax=smax;
		smax=a[i];
	}else if(tmax<a[i]) {
		temp=tmax;
		tmax=a[i];
	}
}System.out.println(fmax+" "+smax+" "+tmax);

}
}