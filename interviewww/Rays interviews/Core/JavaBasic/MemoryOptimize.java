package com.raystech.JavaBasic;

public class MemoryOptimize {

	protected void finalize() {

		System.out.println("Memory Optimize");

	}

	public static void main(String[] args) {

		MemoryOptimize m = new MemoryOptimize();
		MemoryOptimize n = new MemoryOptimize();

		m = n;
		System.gc(); // System.gc() method is equivalent to Runtime.getRuntime().gc() method
		// Runtime.getRuntime().gc();
	}

}
