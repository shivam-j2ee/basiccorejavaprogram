package com.raystech.JavaBasic;

public class FindEvenNo {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		for (int i = 2; i <= 50; i++) {

			if (i % 2 == 0) {
				System.out.print(i+" ");
				count = count + 1;
				sum = sum + i;
			}
		}
		System.out.println(("\n" + count));
		System.out.println(sum);
	}
}
