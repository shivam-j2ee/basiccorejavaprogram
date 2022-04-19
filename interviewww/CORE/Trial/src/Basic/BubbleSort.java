 package Basic;

public class BubbleSort {
	
	public static void sort(int[] a) {

		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}

	}
	public static void main(String[] args) {
		int[] a= {4,3,6,8,1,70};
	    BubbleSort.sort(a);
	    //System.out.println(a[a.length-2]);
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	    }
	}

	}