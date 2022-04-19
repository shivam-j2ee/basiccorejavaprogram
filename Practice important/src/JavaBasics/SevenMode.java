package JavaBasics;

public class SevenMode {

	public static void main(String[] args) {

		int count = 0;
		for (int n = 1; n < 10; n++) {
			if (n % 2 == 0) {
				count = count + n;
			}
		}
		System.out.println(count);
	}
}
