package com.arrayprograms;

import java.util.Scanner;

// Second Maximum/Largest element inside an array

public class Main {
	static int secondSmallestElement(int[] arr){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i=0 ; i<arr.length ; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		return secondSmallest;
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
		int res = secondSmallestElement(arr);
		System.out.println("The second Smallest element in the array is:");
		System.out.println(res);
	}
}