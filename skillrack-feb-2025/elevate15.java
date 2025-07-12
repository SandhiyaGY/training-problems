// Sort Names Based on Heights

// You are given an array of strings names, and an array heights that consists of distinct positive integers.
// Both arrays are of length n.
// For each index i, names[i] and heights[i] denote the name and height of the ith person.
// The program must print the names sorted in descending order by the people's heights.
// Boundary Condition (s):
// 1 <= N<= 10^3
// Input Format:
// The first line contains N.
// The next N lines each containing the name and height.
// Output Format:
// N lines each containing the name of the person.
// Example Input/Output 1:
// Input:
// Arun 180
// Bob 165
// Chithra 170
// Output:
// Arun
// Chithra
// Bob

import java.util.*;

public class elevate15 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Read the number of entries
        int N = sc.nextInt();
        String[] arr = new String[N];
        int[] height = new int[N];

        // Read names and heights
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
            height[i] = sc.nextInt();
        }

        // HashMap to store height-name pairs
        HashMap<Integer, String> heightMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            heightMap.put(height[i], arr[i]);
        }

        // Sort heights in descending order
        Arrays.sort(height);
        String[] result = new String[N];

        int index = 0;
        for (int i = N - 1; i >= 0; i--) {
            result[index] = heightMap.get(height[i]);
            index++;
        }

        // Print sorted names
        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }

        // Close scanner
        sc.close();
    }
}
