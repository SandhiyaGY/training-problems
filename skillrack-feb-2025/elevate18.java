
// Min Operations Make Zero

// You are given a non-negative integer array nums.
// In one operation, you must:
// - Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
// - Subtract x from every positive element in nums.
// The program must print M - the minimum number of operations to make every element in nums equal to 0.
// Boundary Condition(s):
// 1 <= Length of nums <= 1000
// Input Format:
// The first line contains N.
// The second line contains N integer values separated by a space.
// Output Format:
// The first line contains M.
// Example Input/Output 1:
// Input:
// 5
// 15035
// Output:
// 3

import java.util.*;

public class elevate18 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int N = sc.nextInt();

        // Array to store elements
        int[] arr = new int[N];

        // Read array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // HashSet to store unique nonzero elements
        Set<Integer> unique = new HashSet<>();

        for (int num : arr) {
            if (num != 0) {
                unique.add(num);
            }
        }

        // Print the count of unique nonzero elements
        System.out.print(unique.size());

        // Close scanner
        sc.close();
    }
}
