// Prefix String of Words

// Given a string s and an array of strings words of length N, determine whether s is a prefix string of words.
// A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.
// The program must print true if s is a prefix string of words, or false otherwise.
// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Each word length <= 20
// Input Format:
// The first line contains s.
// The second line contains N.
// Next N lines each containing a word.
// Output Format:
// The first line contains true or false.
// Example Input/Output 1:
// Input:
// applemangolemonorange
// 6
// apple mango lemon orange guava cherry
// Output: true
import java.util.*;

public class elevate16 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read the target string and trim spaces
        String str = sc.nextLine().trim();

        // Read the number of strings
        int N = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Array to store the strings
        String[] arr = new String[N];

        // Read input strings
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        sc.close();
        // Build the concatenated string
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            sb.append(word);
            if (sb.toString().equals(str)) {
                System.out.print(true);
                return;
            }
            if (sb.length() > str.length()) break;
        }

        // If no match is found
        System.out.print(false);


    }
}
