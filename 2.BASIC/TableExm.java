package in.co.rays.Basic;
public class  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[9][10];
		int count = 2;
		int temp = 1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= 9; j++) {
				arr[i][j] = count * temp;
				temp++;
			}
			temp = 1;
			count++;
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println("------------");
		}
	}

}
