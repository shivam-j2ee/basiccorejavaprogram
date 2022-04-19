package com.raystech.JavaBasic;

public class MemoryRelease {

	public static void main(String[] args) {

		Factorial f = new Factorial();
		Runtime r = Runtime.getRuntime();
		// long v = r.freeMemory();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());

		f = null;
		System.gc();
		System.out.println(r.freeMemory());
		System.out.println(r.freeMemory());
	}

}
