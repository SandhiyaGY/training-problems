// Unique Paths with Obstacles

// You are given R*C integer array grid. There is a robot initially located at the top-left corner (i.e., grid[O]
// [0]). The robot tries to move to the bottom-right corner (i.e., grid[R - 1][C - 1]). The robot can only move either down or right at any point in time.
// An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
// The program must print the P - the number of possible unique paths that the robot can take to reach the bottom-right corner.
// The testcases are generated so that the answer will be less than or equal to 2 * 10^9.
// Boundary Condition (s):
// 1 <= R,C <= 100
// Input Format:
// The first line contains R and C.
// The next R lines each containing C integer values (1 or 0).
// Output Format:
// The first line contains P.
// Example Input/Output 1:
// Input:
// 33
// 000
// 010
// 000
// Output:
// 2
// Example Input/Output 2:
// Input:
// 45
// 00010
// 10110
// 10000
// 00110
// Output:
// 1

import java.util.*;

public class elevate33{
    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // If start or end cell is an obstacle, no path exists
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
            System.out.print(0);
            return;
        }

        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = 0; // Blocked cell
                } else {
                    if (i > 0) {
                        dp[i][j] += dp[i - 1][j];
                    }
                    if (j > 0) {
                        dp[i][j] += dp[i][j - 1];
                    }
                }
            }
        }

        System.out.print(dp[m - 1][n - 1]);
        sc.close();
    }
}
