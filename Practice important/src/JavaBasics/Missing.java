package JavaBasics;

public class Missing {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 7 };
		int[] b = { 1, 3, 4, 5, 8, 9 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(a[i]);
			}
		}

/*		==========================================	*/
		
		for (int i = 0; i < b.length; i++) {
			count = 0;

			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					count++;
				}
			}

			if (count == 0) {
				System.out.print(b[i]);
			}
		}

		/*
		 * int a[]={2,4,6,10}; int b[]={3,5,6,8,12};
		 * 
		 * for(int i=0;i<a.length;i++) { boolean flag = true; for (int j = 0; j
		 * < b.length; j++) { if (a[i] == b[j]) { flag = false; } }
		 * 
		 * if (flag == true) { System.out.println(a[i] + "   " + b[i]); } }
		 */

	}
}
