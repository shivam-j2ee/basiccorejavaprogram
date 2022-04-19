package com.raystech.JavaBasic;

public class FindMissingElementFromArray {

	public static void main(String[] args) {

		int[] a = { 2, 8, 6, 12, 20 };
		int[] b = { 2, 8, 6, 10, 18 };

		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = false;
					// System.out.print(a[i]+" ");
				}
			}
			if (flag == true) {
				System.out.println("Missing Elements are " + a[i]);
			}
		}
	}

}
