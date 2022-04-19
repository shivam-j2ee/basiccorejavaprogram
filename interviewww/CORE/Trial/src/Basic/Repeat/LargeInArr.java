package Basic.Repeat;

public class LargeInArr {
public static void main(String[] args) {
	int[] a= {2,51,12,11};
	int max;
	max=a[0];
	
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}System.out.println(max);
	
}
}
