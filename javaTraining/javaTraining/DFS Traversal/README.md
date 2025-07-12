# DFS Traversal 

## Problem Description

Given an **undirected** and **possibly disconnected** graph `G(V, E)`, perform a **Depth-First Search (DFS)** traversal starting from vertex `0`.  
The graph input is provided as an **adjacency matrix**.

**Important**:
- Start DFS traversal from **vertex 0**.
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
- The graph is **undirected** → edge between `a` and `b` means both `a` is connected to `b` and `b` is connected to `a`.

---

## Output Format

- Print the DFS traversal starting from vertex `0`.
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
0 1 2 3
```

---

## Approach

1. **Graph Construction**:
   - Build the **adjacency matrix** `arr[][]` of size `V x V`.
   - For each edge, mark `arr[start][end] = 1` and `arr[end][start] = 1`.

2. **DFS Traversal**:
   - Use recursion to perform DFS.
   - Use a boolean `visited[]` array to track visited vertices.
   - Start from vertex `0`.
   - Mark vertex `0` as visited and print it.
   - For each adjacent vertex:
     - If not visited, recursively visit that vertex.

3. **Handling Disconnected Graphs**:
   - Since the task specifies starting only from `0`, we perform DFS for the connected component containing vertex `0` only.

---

## Full Code (Given)

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void dfs(int arr[][], int i, boolean visited[], int v) {
        for (int j = 0; j < v; j++) {
            if (arr[i][j] == 1 && !visited[j]) {
                System.out.print(j + " ");
                visited[j] = true;
                dfs(arr, j, visited, v);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();
        boolean vis[] = new boolean[v];
        int arr[][] = new int[v][v];

        // Build the adjacency matrix
        for (int i = 0; i < e; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[start][end] = 1;
            arr[end][start] = 1;
        }

        // Start DFS from vertex 0
        System.out.print(0 + " ");
        vis[0] = true;
        dfs(arr, 0, vis, v);
    }
}
```

---

## Explanation of Code

- **Initialization**:
  - `boolean vis[]`: Marks visited vertices.
  - `arr[][]`: Adjacency matrix to represent the graph.

- **DFS Steps**:
  1. Start at vertex `0`.
  2. Print `0` and mark it as visited.
  3. For every adjacent vertex to the current vertex:
     - If it has not been visited:
       - Print it.
       - Mark it as visited.
       - Recursively perform DFS from there.

- **Disconnected Graph Handling**:
  - Only nodes reachable from vertex `0` will be visited.
  - Nodes in other disconnected components will not be printed.

---

## Time Complexity

- **Building Graph**: \( O(E) \)
- **DFS Traversal**: \( O(V + E) \) — Each vertex and edge is visited once.

**Space Complexity**: \( O(V^2) \) — because of the adjacency matrix.

---

## Notes

- If `V = 0`, output will be empty (nothing printed).
- DFS goes **deep into the graph** before backtracking.
- Adjacency matrix representation is simple but uses **O(V²)** space, so be careful for large graphs.

---

