package in.co.rays.Basic;

public class Missing {

	public static void main(String[] args) {
		int [] a  = {1,2,3,5,6,7};
		int [] b = {1,3,4,5,8,9};
		for(int i = 0;i<a.length;i++){
			boolean flag = true;
			for(int j = 0;j<b.length;j++){
				if (a[i]==b[j]){
					flag = false;
				}
				else if(flag==true){
					System.out.println(a[i]);
					System.out.println(b[j]);
				}
			}
			
		}
	}

}
