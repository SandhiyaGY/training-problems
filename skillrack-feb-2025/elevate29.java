// Maximum Single Swap

// You are given an integer N. You can swap two digits at most once to get the maximum valued number.
// The program must print M - the maximum valued number you can get.
// Boundary Condition(s):
// 10 < N <= 10^9
// Input Format:
// The first line contains N.
// Output Format:
// The first line contains M.
// Example Input/Output 1:
// Input:
// 2756
// Output:
// 7256
// Example Input/Output 2:
// Input:
// 9854
// Output:
// 9854

import java.util.*;

public class elevate29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = Integer.toString(N);
        char[] digits = str.toCharArray();
        int len = digits.length;
        int[] last = new int[10];

        // Store the last occurrence of each digit
        for (int i = 0; i < len; i++) {
            last[digits[i] - '0'] = i;
        }

        // Try to find the largest possible number by swapping
        for (int i = 0; i < len; i++) {
            for (int d = 9; d > digits[i] - '0'; d--) {
                if (last[d] > i) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[last[d]];
                    digits[last[d]] = temp;

                    // Print the new maximum number and return
                    System.out.println(new String(digits));
                    sc.close();
                    return;
                }
            }
        }

        // If no swap was made, print the original number
        System.out.println(N);
        sc.close();
    }
}
