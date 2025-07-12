// Shuffle String

// You are given a string S and an integer array indices of the same length. The string S will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
// The program must print the shuffled string H.
// Boundary Condition(s):
// 1 <= Length of S <= 10^4
// Input Format:
// The first line contains S.
// The second line contains N integer values.
// Output Format:
// The first line contains H.
// Example Input/Output 1:
// Input:
// silikackr
// 043216785
// Output: skillrack
// Example Input/Output 2:
// Input:
// nmatllspclqalbvftcvk
// 5 16 6 19 0 3 15 11 10 13 17 18 12 8 7 9 1 14 4
// Output:
// Icclknafvtlpbqvsmalt

import java.util.Scanner;

public class elevate14 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String str = sc.nextLine();

        // Array to store integer positions
        int[] arr = new int[str.length()];

        // Read integer values into array
        for (int i = 0; i < str.length(); i++) {
            arr[i] = sc.nextInt();  
        }

        // Convert string to character array
        char[] charArr = new char[str.length()];

        // Assign characters based on positions in 'arr'
        for (int i = 0; i < str.length(); i++) {
            charArr[arr[i]] = str.charAt(i);
        }

        // Print the modified character array as a string
        System.out.print(new String(charArr));

        // Close scanner
        sc.close();
    }
}
