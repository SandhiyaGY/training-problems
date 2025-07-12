# Count Number of Nodes in a Binary Tree

## Problem Description

You are given the root node of a binary tree.  
Your task is to **count the total number of nodes** present in the tree.

- `-1` is used to indicate a missing (null) node during input.

---

## Input Format

- A single line containing space-separated integers representing the tree nodes in level order.
- `-1` indicates that a left or right child is missing.

---

## Output Format

- A single integer representing the total number of nodes present in the binary tree.

---

## Constraints

- \(1 \leq N \leq 10^6\) where \(N\) is the number of nodes.
- Time Limit: 1 second.

---

## Sample Input 0

```
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
```

## Sample Output 0

```
7
```

---

## Approach (Based on the Given Code)

1. **Node Creation**:  
   - A `Node` class is used to represent each node having `data`, `left`, and `right`.
2. **Binary Tree Construction**:  
   - Use a queue to build the tree level-by-level.
   - For each node:
     - Read two values for its left and right children.
     - If the value is not `-1`, create a new `Node` and link it.
3. **Counting Nodes**:
   - Use a recursive method `countNode(root)`:
     - If the current node is `null`, return `0`.
     - Otherwise, return `1 + count of left subtree + count of right subtree`.
4. **Final Output**:
   - Print the total node count.

---

## Visual Representation (for Sample Input)

```
        1
      /   \
     2     3
    / \   / \
   4   5 6   7
```

Total nodes = 7.

---

## Full Code (Given)

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}

public class Solution {
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        return countNode(root.left)+countNode(root.right)+1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[]=sc.nextLine().split(" ");
        Queue<Node> q=new LinkedList<>();
        Node root=new Node(Integer.parseInt(arr[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            Node cur=q.poll();
            if(Integer.parseInt(arr[i])!=-1)
            {
                Node temp=new Node(Integer.parseInt(arr[i]));
                cur.left=temp;
                q.add(temp);
            }
            i++;
            if(Integer.parseInt(arr[i])!=-1)
            {
                Node temp=new Node(Integer.parseInt(arr[i]));
                cur.right=temp;
                q.add(temp);
            }
            i++;
        }
        System.out.print(countNode(root));
    }
}
```

---

## Notes

- Level-order input handling ensures that the tree is built correctly.
- Recursive counting guarantees that each node is counted exactly once.

---
