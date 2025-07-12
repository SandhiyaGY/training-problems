// Island Perimeter

// You are given R*C grid representing a map where grid[i]D] = 1 represents land and grid[ill] = 0 represents
// water.
// Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
// The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island.
// One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. The program must print the perimeter of the island.
// Boundary Condition (s):
// 1 < R, C <= 100
// Example Input/Output 1:
// Input:
// 54
// 1110
// 1111
// 0011
// 1110
// 1111
// Output:
// 24

import java.util.*;

public class elevate20 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read dimensions of the matrix
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Initialize matrix
        int[][] mat = new int[m][n];

        // Read matrix values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Variable to store the perimeter
        int perimeter = 0;

        // Calculate perimeter
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    perimeter += 4; // Each cell contributes 4 sides

                    // Check if there is an adjacent cell above
                    if (i > 0 && mat[i - 1][j] == 1) {
                        perimeter -= 2; // Remove shared vertical edge
                    }
                    // Check if there is an adjacent cell to the left
                    if (j > 0 && mat[i][j - 1] == 1) {
                        perimeter -= 2; // Remove shared horizontal edge
                    }
                }
            }
        }

        // Print the total perimeter
        System.out.print(perimeter);

        // Close scanner
        sc.close();
    }
}
