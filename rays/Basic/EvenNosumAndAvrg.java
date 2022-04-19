package in.co.rays.Basic;

public class EvenNosumAndAvrg {
	
	public static void main(String[] args) {
		
		int evenSum=0;
		int oddSum=0;
		int evenCount=0;
		int oddCount=0;
		
		for (int i = 1; i <50; i++) {
			if(i%2==0){
				evenSum=evenSum+i;
				evenCount++;
				System.out.println(i+" ");
			}else{
				oddSum=oddSum+i;
				oddCount++;
			}
			
		}
		double evenAvg=evenSum/evenCount;
		System.out.println("Even avg ="+evenAvg);
		
		double oddAvg=oddSum/oddCount;
		System.out.println("odd avg="+oddAvg);
	}

}
