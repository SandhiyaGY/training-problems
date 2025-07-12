// Min Swaps 1 Contiguous

// You are given a string S of length N consisting of 0 and 1. It is guaranteed that S contains at least one 1.
// You may perform the following operation any number of times (possibly zero):
// - Swap a character and the adjacent character.
// The program must print M, the minimum number of operations needed so that all 1s are contiguous.
// ?
// Boundary Condition(s):
// 1<=N<= 5*10^5
// Input Format:
// The first line contains S.
// The pies ine contains M.
// Example Input/Output 1:
// Input:
// 0101001001
// Output:7
// Example Input/Output 2:
// Input:
// 100
// Output:0
import java.util.*;

public class elevate31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        sc.close();
        List<Integer> ones = new ArrayList<>();

        // Store the positions of '1's in the string
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '1') {
                ones.add(i);
            }
        }

        int size = ones.size();
        if (size <= 1) {
            System.out.print(0);
            return;
        }

        // Find the median position
        int mid = size / 2;
        int midValue = ones.get(mid);
        long moves = 0;

        // Calculate the minimum moves required
        for (int i = 0; i < size; i++) {
            int target = midValue - (mid - i);
            moves += Math.abs(ones.get(i) - target);
        }

        System.out.print(moves);

    }
}
