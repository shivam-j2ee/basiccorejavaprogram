package in.co.rays.Basic;

public class ThiredLarge {
	public static void main(String[] args) {
			int []a={11,205,31,111,45,89,98,65};
			int temp;
			for(int i=0;i<a.length-1;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[i]>a[j]){
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
			for(int k=0;k < a.length; k++){
				System.out.println(a[k]);
			}
			System.out.println("Third large"+a[a.length-3]);
		
		}
		
	
	}
	


