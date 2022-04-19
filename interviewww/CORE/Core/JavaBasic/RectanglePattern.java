package com.raystech.JavaBasic;

public class RectanglePattern {

	public static void main(String[] args) {

		
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i+j<=5){
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			for(int k=5;k<=8;k++){
				if(k-i>=4){
					System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i>=j){
					System.out.print(i);
					
				}else {
					System.out.print(" ");
				}
			}
			for(int k=5;k<=8;k++){
				if(i+k>=9){
					System.out.print(k);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
