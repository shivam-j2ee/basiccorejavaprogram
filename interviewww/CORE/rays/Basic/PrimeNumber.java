package in.co.rays.Basic;
public class PrimeNumber {

	public static void main(String[] args) {
		int num=19;
		boolean flag=true;
		if(num==0||num==1){
			flag=true;
		}
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag=false;
				break;
			}
			else{
				flag=true;
			}
		}
		if(flag==true){
			System.out.println(num+" is  a prime number");
		}else{
			System.out.println(num+" is not a prime number");
		}
	}
}
