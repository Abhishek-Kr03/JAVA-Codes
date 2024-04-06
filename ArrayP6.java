package com.arrayprograms;

import java.util.Scanner;

// Maximum/Largest pair sum among the given array elements (Positive or Negative)

public class Main {
	static int maxPairSum(int[] arr){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i=0 ; i<arr.length ; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest + largest;
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
		int res = maxPairSum(arr);
		System.out.println("The maximum sum of pairs among the given element is:");
		System.out.println(res);
	}
}
