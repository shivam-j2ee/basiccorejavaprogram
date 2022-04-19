package oop.TrialOop;

public class MultiLevelC extends MultiLevelB {
 public void view() {
 System.out.println("Multilevel c");
 }
 public static void main(String[] args) {
	MultiLevelC c=new MultiLevelC();
	c.view();
	
	MultiLevelB b=new MultiLevelB();
	b.view();
	
	MultiLevel m=new MultiLevel();
	m.view();
	
	MultiLevel n=new MultiLevelC();
	n.view();
}
}
