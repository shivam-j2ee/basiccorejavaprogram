package Basic;

public class ThirdLargArr {
public static void main(String[] args) {
	
	int[] a= {4,6,23,12,33};
	int Fmax,Smax,Tmax;
	
	Fmax=Smax=Tmax=a[0];
	 
	for(int i=0;i<a.length;i++) {
		if(Fmax<a[i]) {
			Tmax=Smax;
			Smax=Fmax;
			Fmax=a[i];
		}else if(Smax<a[i]) {
			Tmax=Smax;
			Smax=a[i];
		}else if(Tmax<a[i]) {
			Tmax=a[i];
		}
	}
	System.out.println("First Maximum "+Fmax);
	System.out.println("Second Maximum "+Smax);
	System.out.println("Third Maximum "+Tmax);

}
} 