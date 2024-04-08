package com.arrayprograms;

import java.util.Scanner;

// Total pairs of the elements in the given array

public class Main {
	
	static void pairsInArray(int[] arr){
		for (int i=0 ; i<arr.length-1 ; i++) {
			for (int j=i+1 ; j<arr.length ; j++) {
				System.out.println(arr[i] + " " + arr[j]);
			}
		}
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
		System.out.println("Total pair of elements in the given array is:");
		pairsInArray(arr);

	}
}
