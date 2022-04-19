package com.raystech.JavaBasic;

public class TestArmstrongNo {

	public static void main(String[] args) {

		int a = 153, sum = 0, r = 0, n = a;
		while (a != 0) {
			r = a % 10;
			sum = sum + r * r * r;
			a = a / 10;

		}
		System.out.println(sum);
		if (sum == n) {

			System.out.println("Armstrong No. " + sum);
		} else {
			System.out.println("Not Armstrong " + sum);
		}

	}

}
