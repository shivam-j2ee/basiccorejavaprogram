package in.co.rays.Basic;



public class MissingElements {
	public static void main(String[] args) {
		int a[]={2,4,6,10};
		int b[]={3,5,6,8,12};
	
		for(int i=0;i<a.length;i++){	
			boolean flag=true;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					flag=false;
					
					
				}}
			
			if(flag==true){
				
				System.out.println(a[i]+"   "+ b[i]);
			}
		}
	}}
	


