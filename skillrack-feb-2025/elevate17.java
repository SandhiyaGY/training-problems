// Ransom Note

// Given two strings R (RansomNote) and M(Magazine), print true if R can be constructed by using the letters from M and false otherwise.
// Each letter in M can only be used once in R.
// Boundary Condition (s):
// 1 <= Length of R, M <= 10^5
// ?
// Input Format:
// The first line contains R.
// The second line contains M.
// Output Format:
// The first line contains true or false
// Example Input/Output 1:
// Input: ab aab
// Output: true
// Example Input/Output 2:
// Input: bb
// aab
// Output: false

import java.util.*;

public class elevate17 {
    public static boolean checkCanForm(String ransom, String magazine) {
        // HashMap to store character frequencies in magazine
        HashMap<Character, Integer> magCount = new HashMap<>();

        // Count characters in magazine
        for (char ch : magazine.toCharArray()) {
            magCount.put(ch, magCount.getOrDefault(ch, 0) + 1);
        }

        // Check if ransom note can be formed
        for (char ch : ransom.toCharArray()) {
            if (!magCount.containsKey(ch) || magCount.get(ch) == 0) {
                return false;  // Not enough characters
            }
            magCount.put(ch, magCount.get(ch) - 1);
        }

        return true; // All characters found
    }

    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read ransom note and magazine
        String ransom = sc.nextLine();
        String magazine = sc.nextLine();

        // Check if ransom note can be formed
        System.out.print(checkCanForm(ransom, magazine));

        // Close scanner
        sc.close();
    }
}
