package Basic;

public class ReversePattern {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=5;j++) {
			System.out.print("*");
		}System.out.println(" ");
	}
	for(int i=4;i>=1;i--) {
		for(int j=i;j<=5;j++) {
			System.out.print("*");
		}System.out.println(" ");
	}
}
}
