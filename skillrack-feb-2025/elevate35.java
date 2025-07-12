// A B C Equi Distant

// A string S is given as the input. The program must find N that represents in how many places in S have A, B, and C in indices i, j and k so that S[il='A* and Sil='B' and S[k]='C' and j-i=k-j.
// Boundary Condition(s):
// 3 <= Length of S < = 100
// Input Format:
// The first line contains S.
// ?
// Output Format:
// The first line contains N.
// Example Input/Output 1:
// Input:
// AABCC
// Output:
// 2
// Example Input/Output 2:
// Input:
// AABAAABBAEDCCCD
// Output:
// 4

import java.util.*;

public class elevate35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();
        
        int count = 0;
        int length = S.length();

        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'A') {
                for (int j = i + 1; j < length; j++) {
                    if (S.charAt(j) == 'B') {
                        int k = 2 * j - i; // Calculate the required k
                        if (k < length && S.charAt(k) == 'C') {
                            count++;
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
