// Map Integer to Alphabets

// A string S is formed by digits and '#'. We want to map S to English lowercase characters as follows:
// - Characters ('a' to 'i') are represented by ('1' to '9') respectively.
// - Characters ('j' to 'Z') are represented by ('10#' to '26#') respectively.
// The program must print the string formed after mapping.
// The test cases are generated so that a unique mapping will always exist.
// Boundary Condition(s):
// 1 <= Length of S <= 1000
// Example Input/Output 1:
// Input:
// 10#11#14
// Output: jkad
// Example Input/Output 2:
// Input:
// 1325#
// Output: acy

import java.util.Scanner;

public class elevate2 {
    public static void main(String[] args) {
        // Creating a Scanner object to take input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Reading input string
        sc.close(); // Closing the scanner to prevent resource leak

        StringBuilder sb = new StringBuilder(); // Initializing StringBuilder
        int i = 0, len = str.length();

        while (i < len) {
            if (i + 2 < len && str.charAt(i + 2) == '#') {
                // Extracting two-digit number and converting to character
                int num = Integer.parseInt(str.substring(i, i + 2));
                sb.append((char) ('a' + num - 1));
                i += 3; // Skipping next characters as they are already processed
            } else {
                // Processing single-digit character
                int num = str.charAt(i) - '0';
                sb.append((char) ('a' + num - 1));
                i++;
            }
        }

        // Printing the decoded string
        System.out.println(sb.toString());
    }
}
