package com.raystech.JavaBasic;

public class TestFirstSecondAndThirdLargestNo {

	public static void main(String[] args) {

		int[] a ={23,5,78,25,56};
		int l=0,sl=0,tl=0;
		
		for(int n:a){
			if(n>l){
				tl=sl;
				sl=l;
				l=n;
				
			}else if(n>sl){
				tl=sl;
				sl=n;
				
			}else if(n>tl){
				tl=n;
			}
		}
		System.out.println("Largest No. "+l);
		System.out.println("Second Largest No. "+sl);
		System.out.println("Third Largest No. "+tl);
	}

}
