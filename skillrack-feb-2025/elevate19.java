// Consecutive Characters

// The power of the string is the maximum length of a non-empty substring that contains only one unique character.
// Given a string S, return the power of S.
// Boundary Condition(s):
// 1<= Length of S <= 500
// Example Input/Output 1:
// Input: skillrack
// Output:2
// Example Input/Output 2:
// Input:
// aaabbbbccccdddaaaaabbb
// Output:5

import java.util.*;

public class elevate19 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read input string
        String str = sc.nextLine();
        
        int maxLen = 0;
        int i = 0;

        // Iterate through string
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(i) != str.charAt(j)) {
                i = j;
            } else {
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        // Print the maximum length of substring with repeating characters
        System.out.print(maxLen);

        // Close scanner
        sc.close();
    }
}

