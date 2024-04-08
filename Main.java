package com.arrayprograms;

import java.util.Scanner;

// Total pairs of the elements in the given array

public class Main {
	
	static int pairsInArray(int[] arr){
		int  count = 0;
		for (int i=0 ; i<arr.length-1 ; i++) {
			for (int j=i+1 ; j<arr.length ; j++) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements of the Array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Total counts of pair of elements in the given array is:");
		int res = pairsInArray(arr);
		System.out.println(res);

	}
}