//find grid
// You are given an N*N grid S and an M*M grid T.
// The colors of the cells in S and T are represented by . and #. White is represented by • and black is represented by #.
// The program must find T within S and print the row and column position of the top left cell of T within S.
// Boundary Condition(s):
// 2 <= N, M <= 50
// Example Input/Output 1:
// Input:
// 32
// #.#
// .#
// ##.
// #
// #.
// Output:
// 22
// Example Input/Output 2:
// Input:
// 73
// •#####.
// .#.＃.#
// ＃，#.#
// …###—
// ...#..
// .#.#…
// ####…—
// #.
// .#
// .#.
// Output:
// 33
import java.util.*;

public class elevate27 {
    public static boolean isSubarray(char[][] large, char[][] small, int i, int j) {
        int r = small.length, c = small[0].length;
        
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                if (large[i + row][j + col] != small[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] large = new char[N][N];
        char[][] small = new char[M][M];

        for (int i = 0; i < N; i++) {
            large[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < M; i++) {
            small[i] = sc.nextLine().toCharArray();
        }

        boolean found = false;

        for (int i = 0; i <= N - M; i++) {
            for (int j = 0; j <= N - M; j++) {
                if (isSubarray(large, small, i, j)) {
                    System.out.print((i + 1) + " " + (j + 1));
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.print("-1 -1");  // No subarray match found
        }

        sc.close();
    }
}
