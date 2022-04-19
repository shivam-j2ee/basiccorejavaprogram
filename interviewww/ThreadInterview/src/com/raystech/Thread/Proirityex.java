package com.raystech.Thread;

public class Proirityex extends Thread {

	public Proirityex(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i +" "+ getName() + " priority= " + getPriority());
		}

	}

	public static void main(String[] args) {
		Proirityex p1 = new Proirityex("one");
		p1.setPriority(3);
		p1.start();
	}

}
