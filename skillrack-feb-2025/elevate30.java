// Simplify Graph

// There is a graph with N nodes and E edges. We must make the graph simple by following the below operations.
// - Remove any self loop (edges connecting a node to itself)
// - Remove multiple edges connecting two nodes (just one edge connecting two nodes is sufficient).
// The program must print R, the number of edges to be removed to make the graph simple.
// ?
// Boundary Condition (s):
// 1 <= N <= 10^5
// 1<= E<= 5*10^5
// Input Format:
// The first line contains N and E.
// The next E lines contain the source and destination of the edge.
// Output Format:
// The first line contains R.
// Example Input/Output 1:
// Input:
// 35
// 12
// 23
// 32
// 31
// 11
// Output:2
import java.util.*;

public class elevate30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int N = sc.nextInt(); // Number of nodes
        int E = sc.nextInt(); // Number of edges
        int count = 0; // Count of edges to be removed

        Set<String> edges = new HashSet<>();

        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                // Self-loop detected
                count++;
            } else {
                // Normalize edge representation (store smaller node first)
                String edge = a < b ? a + "-" + b : b + "-" + a;
                if (!edges.add(edge)) {
                    // Multiple edges detected
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
