// Bird Nest Movement

// There are N birds numbered from 1 to N, and there are N nests numbered from 1 to N. Initially, bird i is in nest i for 1 ? i ?N.
// There are Q queries to process in order. There are two types of queries.
// Type 1: B T: Move bird B to nest T.
// Type 2: Print the number of nests that contain more than one bird.
// Boundary Condition (s):
// 2 <= N <= 10^6
// 1<= Q<= 10^5
// 1<= B, T <= N
// Example Input/Output 1:
// Input:
// 47
// 2
// 112
// 2
// 132
// 2
// 134
// 2
// Output:
// 0112
// Example Input/Output 2:
// Input:
// 5 10
// 2
// 143
// 145
// 2
// 131
// 2
// 123
// 125
// 113
// 2
// Output:
// 0121
import java.util.*;

public class elevate28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int query = sc.nextInt();
        
        int[] nest = new int[n + 1];
        int[] bird = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            bird[i] = i;
            nest[i] = 1;
        }

        int count = n; // Initially, each nest has one bird
        StringBuilder sb = new StringBuilder();

        while (query-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                int b = sc.nextInt();
                int t = sc.nextInt();
                int current = bird[b];

                nest[current]--;
                if (nest[current] == 0) count--;

                bird[b] = t;
                if (nest[t] == 0) count++;
                nest[t]++;
            } else if (type == 2) {
                sb.append(count).append(" ");
            }
        }

        System.out.print(sb.toString().trim());
        sc.close();
    }
}
