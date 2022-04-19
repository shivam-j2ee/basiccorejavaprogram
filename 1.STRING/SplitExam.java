package in.co.rays.string;

public class SplitExam {
	public static void main(String[] args) {
		
		String str ="aa bb ff";
		String [] s1=str.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
		}
	}

}
 