package com.arrayprograms;

import java.util.Scanner;

// Minimum/Smallest product pairs among the given array elements (Positive or Negative).

public class Main {
	static int minProductPairs(int[] arr){
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i=0 ; i<arr.length ; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		int p1 = largest * secondLargest;
		int p2 = smallest * secondSmallest;
		int p3 = largest * smallest;
		int minProduct = (p1 < p2) ? ((p1 < p3) ? p1 : p3) : (p2 < p3) ? p2 :p3;
		return minProduct;
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
		int res = minProductPairs(arr);
		System.out.println("The minimum product pairs among the given elements is:");
		System.out.println(res);
	}
}
