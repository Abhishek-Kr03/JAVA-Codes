package com.arrayprograms;

import java.util.Scanner;

// Minimum/Smallest pair sum among the given array elements (Positive or Negative)

public class Main {
	static int minPairSum(int[] arr){
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
		return secondSmallest + smallest;
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
		int res = minPairSum(arr);
		System.out.println("The minimum sum of pairs among the given element is:");
		System.out.println(res);
	}
}
