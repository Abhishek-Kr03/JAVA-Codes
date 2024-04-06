package com.arrayprograms;

import java.util.Scanner;

// Minimum/Smallest element inside an array

public class Main {
	static int SmallestElement(int[] arr){
		int max = Integer.MAX_VALUE;
		for (int i=0 ; i<arr.length ; i++) {
			if (arr[i]< max) {
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
		int res = SmallestElement(arr);
		System.out.println("The Smallest element in the array is:");
		System.out.println(res);
	}
}
