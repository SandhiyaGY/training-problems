// Final Snake Position

// There is a snake in an N*N matrix grid and can move in four possible directions. Each cell in the grid is
// identified by the position: grid[i][] = (i * N) + j.
// The snake starts at cell 0 and follows a sequence of C commands.
// You are given an integer n representing the size of the grid and an array of strings commands where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT". It's guaranteed that the snake will remain within the grid boundaries throughout its movement.
// The program must print P - the position of the final cell where the snake ends up after executing commands.
// Boundary Condition(s):
// 2 < N <= 10
// Input Format:
// The first line contains N and C
// The second line contains C commands separated by a space.
// Output Format:
// The first line contains P.
// Example Input/Output 1:
// Input:
// 22
// RIGHT DOWN
// Output:
// 3
// Example Input/Output 2:
// Input:
// 43
// DOWN RIGHT DOWN
// Output:
//9
import java.util.*;

public class elevate32{
    public static int find(int n, String[] commands) {
        int x = 0, y = 0; // Initial position

        for (String command : commands) {
            int newX = x, newY = y;

            switch (command) {
                case "UP":
                    newX = x - 1;
                    break;
                case "DOWN":
                    newX = x + 1;
                    break;
                case "LEFT":
                    newY = y - 1;
                    break;
                case "RIGHT":
                    newY = y + 1;
                    break;
            }

            // Check if the new position is within bounds
            if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                x = newX;
                y = newY;
            }
        }

        return (x * n) + y; // Convert (x, y) to a single index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int c = sc.nextInt();
        sc.nextLine(); // Consume the newline
        String[] commands = sc.nextLine().split(" ");
        
        System.out.print(find(n, commands));
        sc.close();
    }
}

