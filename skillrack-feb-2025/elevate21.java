// Given a string S of zeros and ones, print M, the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).
// The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.
// Boundary Condition(s):
// 2 <= S <= 10^5
// Input Format:
// The first line contains S.
// Output Format:
// The first line contains M.
// Example Input/Output 1:
// Input:
// 011101
// Output:
// Explanation:
// Splitting into O 11101 will give 1+4=5 which is the maximum.
// Example Input/Output 2:
// Input:
// 00111
// Output:
// 5
// Explanation:
// Splitting into 00 111 will give 2+3=5.
import java.util.*;

public class elevate21 {
    public static int maxScore(String str) {
        int onesCount = 0, zerosCount = 0, maxScore = 0;

        // Count total ones in the string
        for (char ch : str.toCharArray()) {
            if (ch == '1') onesCount++;
        }

        // Traverse and calculate max score
        for (int i = 0; i < str.length() - 1; i++) { // Avoid last split
            if (str.charAt(i) == '0') {
                zerosCount++; // Left part contribution
            } else {
                onesCount--; // Right part contribution
            }
            maxScore = Math.max(maxScore, zerosCount + onesCount);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxScore(str));
        sc.close();
    }
}
