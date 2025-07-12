// Count Integers Before

// Given an Integer array nums of length N, for each nums[i], the program must print how many numbers in the array are smaller than it. That is, for each nums[il you have to count the number of valid j's such that j != i and nums[il < nums[i].
// Boundary Condition(s):
// 1 <= N <= 10^5
// 0 <= Each integer value <= 10^9
// Input Format:
// The first line contains N.
// The second line contains N integer values.
// Output Format:
// The first line contains N integer values.
// Example Input/Output 1:
// Input:
// 40 10 20 30
// Output:
// 3012
// Example Input/Output 2:
// Input:
// 3
// 65 65 65
// Output:
// 000
import java.util.*;

public class elevate24 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] sortArr = new int[N];

        // Read array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sortArr[i] = arr[i];
        }

        // Sort the copied array
        Arrays.sort(sortArr);

        // Create a HashMap to store ranks
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks based on sorted values
        for (int i = 0; i < N; i++) {
            if (!rankMap.containsKey(sortArr[i])) {
                rankMap.put(sortArr[i], rank++);
            }
        }

        // Create the result array to store ranks
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        // Print the ranks
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }

        // Close the scanner
        sc.close();
    }
}
