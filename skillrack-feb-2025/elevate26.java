// Percentage of Letter

// Given a string S and a character letter CH, the program must print P - the percentage of characters in S that equal letter rounded down to the nearest whole percent.
// Boundary Condition(s):
// 1 <= Length of S <= 10^4
// Input Format:
// The first line contains S.
// The second line contains CH.
// Output Format:
// The first line contains P.
// Example Input/Output 1:
// engine 
// e
// Output:
// 33
// Example Input/Output 2:
// Input:
// jjjj
// k
// output:
// 0

import java.util.*;

public class elevate26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }

        double percentage = ((double) count / str.length()) * 100;
        System.out.print((int) Math.floor(percentage));

        sc.close();
    }
}

