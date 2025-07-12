// Faulty Keyboard

// Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
// You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
// The program must print F - the final string that will be present on your laptop screen.
// Boundary Condition(s):
// 1 <= Length of s <= 1000
// Input Format:
// The first line contains s.
// Output Format:
// The first line contains F.
// Example Input/Output 1:
// Input: parsing
// Output: srapng
// Example Input/Output 2:
// Input: mixing
// Output:xmng

import java.util.Scanner;

public class elevate13 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close(); // Closing scanner to prevent resource leak

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i') {
                sb.reverse(); // Reverse the current content of StringBuilder
            } else {
                sb.append(str.charAt(i)); // Append character
            }
        }

        System.out.print(sb.toString()); // Print final result
    }
}
