// Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.
// Every house can be warmed, as long as the house is within the heater's warm radius range. 
// Given the positions of houses and heaters on a horizontal line, return the minimum radius standard of heaters so that those heaters could cover all houses.
// Notice that all the heaters follow your radius standard, and the warm radius will the same.

// Example 1:

// Input: houses = [1,2,3], heaters = [2]
// Output: 1
// Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
// Example 2:

// Input: houses = [1,2,3,4], heaters = [1,4]
// Output: 1
// Explanation: The two heaters were placed at positions 1 and 4. We need to use a radius 1 standard, then all the houses can be warmed.
// Example 3:

// Input: houses = [1,5], heaters = [2]
// Output: 3

import java.util.Arrays;
import java.util.Scanner;

public class elevate4 {
    public static int findNear(int house, int[] heaters) {
        int left = 0, right = heaters.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (heaters[mid] < house) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int nearDist = Math.abs(heaters[left] - house);

        if (left > 0) {
            nearDist = Math.min(nearDist, Math.abs(heaters[left - 1] - house));
        }

        return nearDist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] houses = new int[m];
        int[] heaters = new int[n];

        for (int i = 0; i < m; i++) {
            houses[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            heaters[i] = sc.nextInt();
        }

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int maxRadius = 0;

        for (int house : houses) {
            int nearDist = findNear(house, heaters);
            maxRadius = Math.max(maxRadius, nearDist);
        }
        System.out.println(maxRadius);
        sc.close();
    }
}
