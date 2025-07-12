# Print adjacency list

## Problem Description

Given the number of vertices `V` and edges `E` of a bidirectional (undirected) graph, build the graph using an **adjacency list** and print the adjacency list for each vertex.

Each test case provides its own graph data, and the graph must be created and printed accordingly.

---

## Input Format

- First line: `T` (number of test cases)
- For each test case:
  - First line: Two integers, `V` and `E`  
    (number of vertices and number of edges respectively)
  - Next `E` lines: Each line contains two integers `start` and `end` representing an undirected edge between the vertices.

**Note**: Vertices are numbered from 0 to V-1.

---

## Output Format

- For each vertex, print its adjacency list in the following format:
  ```
  vertex-> neighbor1-> neighbor2-> neighbor3 ...
  ```
- Neighbors should be printed in the order they were added (no sorting).
- Each vertex's adjacency list should be printed on a separate line.

---

## Constraints

- \( 1 \leq T \leq 200 \)  — Number of test cases
- \( 1 \leq V \leq 10^3 \) — Number of vertices
- \( 1 \leq E \leq V \times (V-1) \) — Number of edges (possible maximum for undirected graphs)

---

## Sample Input 0

```
2
5 7
0 1
0 4
1 2
1 3
1 4
2 3
3 4
3 3
0 1
1 2
2 0
```

## Sample Output 0

```
0-> 1-> 4
1-> 0-> 2-> 3-> 4
2-> 1-> 3
3-> 1-> 2-> 4
4-> 0-> 1-> 3
0-> 1-> 2
1-> 0-> 2
2-> 1-> 0
```

---

## Approach

1. **Input Reading**:
   - Read the number of test cases `T`.
   - For each test case:
     - Read the number of vertices `V` and edges `E`.
     - Initialize an adjacency list of `V` empty lists.
   
2. **Graph Construction**:
   - For each edge:
     - Read the `start` and `end` vertices.
     - Since the graph is **bidirectional**, add `end` to `start`'s list and `start` to `end`'s list.

3. **Output**:
   - For each vertex from 0 to V-1:
     - Print the vertex number.
     - Traverse its adjacency list and print each connected vertex prefixed by `-> `.

---

## Full Code (Given)

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            ArrayList<ArrayList<Integer>> a = new ArrayList<>();
            
            // Initialize adjacency list
            for (int i = 0; i < v; i++) {
                a.add(new ArrayList<Integer>());
            }
            
            // Build the graph
            for (int i = 0; i < e; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                a.get(start).add(end);
                a.get(end).add(start);
            }
            
            // Print the adjacency list
            for (int i = 0; i < v; i++) {
                System.out.print(i);
                for (int j = 0; j < a.get(i).size(); j++) {
                    System.out.print("-> " + a.get(i).get(j));
                }
                System.out.println();
            }
        }
    }
}
```

---

## Explanation of Code

- **ArrayList of ArrayLists**:  
  `a` is an array of lists, where `a.get(i)` represents the list of vertices connected to vertex `i`.

- **Adding Edges**:  
  Since the graph is undirected, every time we add an edge between `start` and `end`, we must add `end` to `start`'s list **and** `start` to `end`'s list.

- **Output Format**:
  For each vertex, print the vertex followed by all its adjacent vertices with `"-> "` as separator, maintaining the insertion order.

---

## Time Complexity

- **Building Graph**:  
  Each edge insertion takes \( O(1) \). So for all edges, it is \( O(E) \).

- **Printing Graph**:  
  Traversing the adjacency list of all vertices takes \( O(V + E) \).

- **Total Time Complexity** per test case: \( O(V + E) \)

- **Space Complexity**:  
  The adjacency list uses \( O(V + E) \) space.

---

## Edge Cases

- No edges: Every vertex will only have itself printed without any neighbors.
- Fully connected graphs: Every vertex will have V-1 neighbors.
- Multiple test cases are handled sequentially.

---

