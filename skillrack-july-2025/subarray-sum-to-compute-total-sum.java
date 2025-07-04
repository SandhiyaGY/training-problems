//Problem Statement : Given an array return the minimum sum of sub array used to calculate the total sum
//Example: 
// Input:[10,5,2,6,3,18]
// Output:101
// Explanation:
// Sum of 2 and 3 is 5
// Sum of 5 and 5 is 10
// Sum of 10 and 6 is 16
// Sum of 16 and 10 is 26
// Sum of 26 and 18 is 44
// The total Sum of 5,10,16,26,44 is 101

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            queue.offer(sc.nextInt());
        }
        int minSum = 0;
        while (queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            int curSum = first + second;
            minSum += curSum;
            queue.offer(curSum);
        }
        System.out.println(minSum);
    }
}
