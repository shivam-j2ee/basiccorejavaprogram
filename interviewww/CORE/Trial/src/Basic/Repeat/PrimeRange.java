package Basic.Repeat;

public class PrimeRange {
	
	public static void main(String[] args)  {
		int sum=0;int count=0;

	            for(int i=1; i < 100; i++){
	            	 boolean flag = true;
	                    for(int j=2; j < i ; j++){
	                            if(i % j == 0){
	                                    flag = false;
	                                    break;
	                            }
	                    }
	                    if(flag==true)
	                            System.out.print(i + " ");
	                        sum=sum+i;
	                        count++;
	                    
	            }System.out.println(sum);
	            System.out.println(sum/count);
	    }
		
			}
		
