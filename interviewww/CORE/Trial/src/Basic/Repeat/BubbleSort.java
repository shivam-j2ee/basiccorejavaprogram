package Basic.Repeat;

public class BubbleSort {
	
	public static void bubblesort(int[] a) {
		int temp;
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1]) {
				temp=a[i-1];
				a[i-1]=a[i];
			}
		}
	}
public static void main(String[] args) {
	
	int[] ar= {2,5,11,3};
	bubblesort(ar);
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
	}
		
	}


