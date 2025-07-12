# BFS Traversal 

## Problem Description

Given an **undirected** and **possibly disconnected** graph `G(V, E)`, perform a **Breadth-First Search (BFS)** traversal starting from vertex `0`.  
The graph input is provided as an **adjacency matrix**.

**Important**:
- Start BFS traversal from **vertex 0**.
- Only traverse the connected component of vertex 0.
- Handle graphs that may be disconnected (some vertices unreachable from vertex 0).

---

## Input Format

- The first line contains two integers:
  - `V`: Number of vertices
  - `E`: Number of edges
- Next `E` lines each contain two integers `a` and `b`, denoting an edge between vertex `a` and vertex `b`.

**Note**:
- Vertices are numbered from `0` to `V-1`.
- The graph is **undirected** → an edge between `a` and `b` means both `a` is connected to `b` and `b` is connected to `a`.

---

## Output Format

- Print the BFS traversal starting from vertex `0`.
- Print the vertices space-separated in the order they are visited.

---

## Constraints

- \( 0 \leq V \leq 1000 \)
- \( 0 \leq E \leq \frac{V(V-1)}{2} \)
- \( 0 \leq a, b \leq V-1 \)
- **Time Limit**: 1 second

---

## Sample Input 0

```
4 4
0 1
0 3
1 2
2 3
```

## Sample Output 0

```
0 1 3 2
```

---

## Approach

1. **Graph Construction**:
   - Build the **adjacency matrix** `arr[][]` of size `V x V`.
   - For each edge, mark `arr[start][end] = 1` and `arr[end][start] = 1`.

2. **BFS Traversal**:
   - Use a queue to maintain the order of visiting vertices.
   - Use a boolean `visited[]` array to track visited vertices.
   - Start from vertex `0`.
   - Add vertex `0` to the queue, mark it visited, and print it.
   - While the queue is not empty:
     - Remove the front node.
     - Visit all adjacent unvisited nodes, mark them visited, enqueue them, and print them.

3. **Handling Disconnected Graphs**:
   - Since BFS starts only from vertex `0`, only the connected component containing `0` will be visited and printed.

---

## Full Code (Given)

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void bfs(int arr[][], int v, int e) {
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[v];

        queue.add(0);
        System.out.print(0 + " ");
        visited[0] = true;

        while (!queue.isEmpty()) {
            int t = queue.poll();
            for (int i = 0; i < v; i++) {
                if (arr[t][i] == 1 && !visited[i]) {
                    System.out.print(i + " ");
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[v][v];

        // Build the adjacency matrix
        for (int i = 0; i < e; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[start][end] = 1;
            arr[end][start] = 1;
        }

        bfs(arr, v, e);
    }
}
```

---

## Explanation of Code

- **Initialization**:
  - `Queue<Integer> queue` is used for BFS traversal.
  - `boolean visited[]` keeps track of already visited vertices.

- **BFS Steps**:
  1. Start at vertex `0`.
  2. Add `0` to the queue and mark it as visited.
  3. While the queue is not empty:
     - Dequeue a vertex `t`.
     - For each vertex `i`:
       - If there is an edge from `t` to `i` (i.e., `arr[t][i] == 1`) and `i` is not visited:
         - Print `i`, mark as visited, and enqueue `i`.

- **Disconnected Graph Handling**:
  - Vertices not connected to `0` are **never visited**.
  - Only the component containing `0` is printed.

---

## Time Complexity

- **Building Graph**: \( O(E) \)
- **BFS Traversal**: \( O(V + E) \) — Each vertex and edge is visited at most once.

**Space Complexity**: \( O(V^2) \) — due to the adjacency matrix.

---

## Notes

- If `V = 0`, output will be empty (nothing printed).
- BFS ensures the closest nodes are printed first.
- Adjacency matrix representation is simple but **uses O(V²)** space. For large `V`, adjacency list is preferred.

---


