package org.Array;

public class Array {

	
	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		a[0]=10;
		a[1]=15;
		a[2]=25;
		a[3]=30;
		a[4]=45;
		
		System.out.println(a[3]);
		
		System.out.println("      ");
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("       ");
		
		for (int x : a) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
