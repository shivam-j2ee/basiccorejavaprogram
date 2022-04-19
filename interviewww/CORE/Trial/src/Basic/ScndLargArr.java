package Basic;

public class ScndLargArr {
public static void main(String[] args) {
	int[] a= {4,6,52,46,21};
	int Fmax,Smax;
	
	Fmax=Smax=a[0];
	
	for(int i=0;i<a.length;i++) {
		if(Fmax<a[i]) {
			Smax=Fmax;
			Fmax=a[i];
		}else if(Smax<a[i]) {
			Smax=a[i];
		}
	}
	System.out.println("First Maximum "+Fmax);
	System.out.println("Second Maximum "+Smax);

}
}
