// Length Two Sub-Arrays Equal Sum

// Given a O-indexed integer array of size N, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.
// The program must print true if these subarrays exist, and false otherwise.
// A subarray is a contiguous non-empty sequence of elements within an array.
// Boundary Condition(s):
// 3 <=N<= 10^5
// -10^9 <= Each integer value <= 10^9
// Input Format:
// The first line contains N.
// The second line contains N integer values.
// Output Format:
// The first line contains true or false.
// Example Input/Output 1:
// Input:
// 3
// 424
// Output: true
// Example Input/Output 2:
// Input:
// 5
// 12345
// Output: false

import java.util.*;

public class elevate22 {
    public static boolean checkExist(int[] arr) {
        // Check if the array has fewer than 2 elements
        if (arr.length < 2) {
            return false;
        }

        // Create a set to store sums of adjacent elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array and check for duplicate sums
        for (int i = 0; i < arr.length - 1; i++) {
            int curSum = arr[i] + arr[i + 1];
            if (set.contains(curSum)) {
                return true; // Duplicate sum found
            }
            set.add(curSum);
        }

        return false; // No duplicate sum found
    }

    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Check for duplicate adjacent sums and print the result
        System.out.print(checkExist(arr));

        // Close the scanner
        sc.close();
    }
}
