# Print Adjacency Matrix

## Problem Description

This program implements a graph using an **adjacency matrix**. The adjacency matrix is a 2D array that represents the graph. Each entry in the matrix contains the weight of the edge between the vertices. If no edge exists between two vertices, the entry will be 0.

### Input Format
1. The first input is the number of vertices `v` in the graph.
2. The second input is the number of edges `e`.
3. The third input is a string indicating whether the graph is directed or undirected (`"yes"` for directed, `"no"` for undirected).
4. Following this, each of the next `e` lines describes an edge:
   - The first integer represents the starting vertex of the edge.
   - The second integer represents the ending vertex of the edge.
   - The third integer represents the weight of the edge.

### Output Format
The program should output the **adjacency matrix** of the graph, where each row represents a vertex and each column represents the edge from that vertex to other vertices.

---

## Constraints

- \(1 \leq v \leq 100\): Number of vertices
- \(1 \leq e \leq 1000\): Number of edges
- The graph can either be directed or undirected as per user input.

---

## Sample Input 0

```
4
4
yes
1 2 6
2 3 7
3 4 8
2 4 9
```

## Sample Output 0

```
Adjacency Matrix Representation:
0 6 0 0 
0 0 7 9 
0 0 0 8 
0 0 0 0 
```

---

## Sample Input 1

```
3
2
no
1 2 5
2 3 3
```

## Sample Output 1

```
Adjacency Matrix Representation:
0 5 0 
5 0 3 
0 3 0 
```

---

## Approach

1. **Graph Representation**:  
   The graph is represented by an adjacency matrix `result[v][v]`, where `v` is the number of vertices. Initially, all entries in the matrix are set to 0.

2. **Input Parsing**:  
   - The first input line specifies the number of vertices and edges.
   - The next line specifies whether the graph is directed (`yes`) or undirected (`no`).
   - For each edge, the `start`, `end`, and `weight` values are read, and the corresponding entries in the adjacency matrix are updated.

3. **Adjacency Matrix Update**:
   - If the graph is directed, only the matrix entry for the directed edge is updated.
   - If the graph is undirected, both the matrix entries for the edge in both directions (start to end and end to start) are updated.

4. **Output**:  
   The adjacency matrix is printed row by row.

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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();  // Number of vertices
        sc.nextLine();         // Consume the newline character after integer input
        int e = sc.nextInt();  // Number of edges
        sc.nextLine();         // Consume the newline character after integer input
        
        int[][] result = new int[v][v];  // Initialize the adjacency matrix with zeros
        
        String choice = sc.nextLine();  // Check if the graph is directed or undirected
        
        // Process each edge and update the adjacency matrix
        for (int i = 0; i < e; i++) {
            int start = sc.nextInt();   // Starting vertex
            int end = sc.nextInt();     // Ending vertex
            int weight = sc.nextInt();  // Weight of the edge
            
            result[start - 1][end - 1] = weight;  // Update the adjacency matrix (1-based to 0-based index)
            
            if (choice.equals("no")) {
                result[end - 1][start - 1] = weight;  // If undirected, update both directions
            }
        }
        
        // Print the adjacency matrix
        System.out.println("Adjacency Matrix Representation:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## Explanation of Code

1. **Input Reading**:
   - We start by reading the number of vertices `v` and edges `e`.
   - Then, we read whether the graph is directed or undirected (`yes` or `no`).
   
2. **Adjacency Matrix Initialization**:
   - A 2D array `result` of size `v x v` is created to store the adjacency matrix.
   - Initially, all entries in this matrix are set to zero.

3. **Edge Processing**:
   - For each edge, we update the matrix at the corresponding position.
   - If the graph is undirected, we also update the reverse direction of the edge to ensure bidirectional representation.

4. **Matrix Printing**:
   - After processing all edges, we print the adjacency matrix row by row.

---

## Time Complexity
- **Time Complexity**:  
  The program processes each edge once and updates the adjacency matrix. Hence, the time complexity is \( O(e) \), where \( e \) is the number of edges.

- **Space Complexity**:  
  The space complexity is \( O(v^2) \), where \( v \) is the number of vertices, as we store the adjacency matrix of size \( v \times v \).

---

## Edge Cases
- If there are no edges (`e = 0`), the matrix will contain all zeros.
- If all vertices are isolated, the matrix will have all zeros except possibly the diagonal (if self-loops are allowed).

---

