package Basic.Repeat;

public class Diamond {
public static void main(String[] args) {
	
	/*for(int i=1;i<=n;i++) {
		for(int s=n-i;s>=1;s--) {
			System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}}
			for(int k=i-1;k>=1;k--) {
				System.out.println("* ");
			}
			System.out.println( );
		
	}
}
}
*/
	int n=4;
	 { 
	        // outer loop to handle number of rows 
	        //  n in this case 
	        for (int i=0; i<n; i++) 
	        { 
	  
	            // inner loop to handle number spaces 
	            // values changing acc. to requirement 
	            for (int j=n-i; j>1; j--) 
	            { 
	                // printing spaces 
	                System.out.print(" "); 
	            } 
	   
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop 
	            for (int j=0; j<=i; j++ ) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	   
	            // ending line after each row 
	            System.out.println(); 
	        } 
	        //inverse...
	        
	        for (int i=n-1; i>0; i--) 
	        { 
	  
	            // inner loop to handle number spaces 
	            // values changing acc. to requirement 
	            for (int j=0; j<n-i; j++) 
	            { 
	                // printing spaces 
	                System.out.print(" "); 
	            } 
	   
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop 
	            for (int j=0; j<i; j++ ) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	   
	            // ending line after each row 
	            System.out.println(""); 
	        } 
	        
	        
	        
	    }
	 }
}