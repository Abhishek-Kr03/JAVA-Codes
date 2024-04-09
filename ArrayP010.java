package com.arrayprograms;

import java.util.Scanner;

// Total occurrence of each elements in a sorted array

public class Main {
	static void occurrenceOfElements(int[] arr){
		int count = 1;
		for (int i=0 ; i<arr.length-1 ; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
			}
			else {
				System.out.println(arr[i] + "-" + count);
				count = 1;
			}
		}	
		System.out.println(arr[arr.length-1] + "-" + count);
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
		System.out.println("Total occurrence of each elements in a sorted array is");
		occurrenceOfElements(arr);
	}
}
