// Almost Equal Strings

// You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
// The program must print true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, print false.
// Boundary Condition (s):
// 1 <= Length of S <= 100
// Input Format:
// The first line contains s1.
// The second line contains s2.
// Output Format:
// The first line contains true or false.
// Example Input/Output 1:
// Input: bank kanb
// Output: true
// Example Input/Output 2:
// Input: bank nakb
// Output: false

import java.util.*;

public class elevate25 {
    public static boolean areEqual(String str1, String str2) {
        if (str1.equals(str2)) return true;

        int first = -1, second = -1, count = 0;

        // If strings are not the same length, they can't be equal with one swap
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;

                if (count == 1) {
                    first = i;
                } else if (count == 2) {
                    second = i;
                } else {
                    return false; // More than 2 mismatches → can't be made equal with one swap
                }
            }
        }

        return count == 2 &&
                str1.charAt(first) == str2.charAt(second) &&
                str1.charAt(second) == str2.charAt(first);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.print(areEqual(str1, str2));
        sc.close();
    }
}
