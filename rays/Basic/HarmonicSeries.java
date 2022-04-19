package in.co.rays.Basic;

public class HarmonicSeries {
	  public static void main(String[] args) {
		int num=6,i=1;
		double rst=0.0;
		
		while(i <= num){
			
			System.out.print("1/"+i+"+");
			rst = rst+(double)1/i;
			i++;
		}
		System.out.println("\n\nSum of Harmonic series is"+ rst);
	  }
     
}
