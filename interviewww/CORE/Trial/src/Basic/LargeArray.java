package Basic;

public class LargeArray {
public static void main(String[] args) {
	int[] arr= {2,5,34,38,10};
	
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}System.out.println(max);
}
}
