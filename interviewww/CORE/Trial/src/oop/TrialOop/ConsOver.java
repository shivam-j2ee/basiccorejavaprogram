package oop.TrialOop;

public class ConsOver {
	
	public String s;

	public ConsOver() {
	System.out.println("default constructor");
	}
	
	public ConsOver(String s) {
		this.s=s;
		System.out.println(s);
	}
	public static void main(String[] args) {
		ConsOver c=new ConsOver();
		ConsOver cn=new ConsOver("hello");
	}
}
