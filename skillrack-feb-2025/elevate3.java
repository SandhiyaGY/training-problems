// Split Balanced Strings

// Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
// Given a balanced string S, split it into some number of substrings such that each substring is balanced.
// The program must print the maximum number of balanced strings we can obtain.
// Boundary Condition (s):
// 1 <= Length of S <= 5000
// Example Input/Output 1:
// Input:
// RLRRLLRLRL
// Output:
// 4
// Example Input/Output 2:
// Input:
// RLRRRLLRLL
// Output:
// 2
// Example Input/Output 3:
// Input:
// LLLURRRR
// Output:
// 1

import java.util.Scanner;

public class elevate3 {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Reading input string
        sc.close(); // Closing the scanner to prevent resource leak

        int count = 0, balance = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'L') {
                balance--;
            } else {
                balance++;
            }

            // Whenever balance becomes zero, it indicates a balanced substring
            if (balance == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
