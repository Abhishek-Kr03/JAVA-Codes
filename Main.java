package com.arrayprograms;

import java.util.Scanner;

// Maximum/Largest element inside an array

public class Main {
	static int LargestElement(int[] arr){
		int max = Integer.MIN_VALUE;
		for (int i=0 ; i<arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
		
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
		int res = LargestElement(arr);
		System.out.println("The largest element in the array is:");
		System.out.println(res);
	}
}