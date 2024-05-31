package com.arrayprograms;

import java.util.Scanner;

public class PrimeSubarray {

    // Function to check if a number is prime
    static boolean checkPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i*i <= num ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to find and print all prime-sum subarrays
    static void primeSubarray(int[] arr) {
        boolean foundPrimeSubarray = false;

        // Iterate over all possible subarray sizes
        for (int size = 1; size <= arr.length; size++) {
            // Iterate over all starting points of subarrays of a given size
            for (int i = 0; i <= arr.length - size; i++) {
                int sum = 0;
                // Calculate the sum of the subarray
                for (int j = i; j < i + size; j++) {
                    sum += arr[j];
                }
                // Check if the sum is prime
                if (checkPrime(sum)) {
                    // Print the subarray if the sum is prime
                    for (int j = i; j < i + size; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    foundPrimeSubarray = true;
                }
            }
        }

        // If no prime-sum subarray is found, print "None"
        if (!foundPrimeSubarray) {
            System.out.println("None");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number of elements in the array
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Find and print prime-sum subarrays
        primeSubarray(arr);
        scan.close();
    }
}
