package org.Array;

public class Array1 {

	public static void main(String[] args) {
		
		int a[][]= new int[3][2];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println(a[0][0]);
		
		System.out.println("      ");
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("     ");
		
		for (int[] x : a) {
			for (int y : x) {
			System.out.println(y);	
			}
		}
		
		
		
	}
}
