package Basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MissingElement {

	public static void misEle(int[] a,int[] b){
		for(int i=0;i<a.length;i++){	
			boolean flag=true;
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					flag=false;
					
					
				}}
			
			if(flag==true){
				
				System.out.println(a[i]);
			}
		}
	}

public static void main(String[] args) {
	int a[]={2,4,6,10,11};
	int b[]={3,5,6,8,12};

	MissingElement.misEle(a, b);
	MissingElement.misEle(b, a);
}}






