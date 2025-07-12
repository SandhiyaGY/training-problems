# Take Input Level Wise of Binary Tree and Print Inorder

## Problem Description

You are given a list of integers representing the **level-wise** input of a binary tree.  
Your task is to:

- Build the binary tree based on the level order input.
- Perform **inorder traversal** and print the elements.

📍 **Important**:
- `-1` represents **no node** (i.e., a null child).

---

## Input Format

- A single line containing space-separated integers.
- Each integer represents a node's value **level-wise**.
- `-1` indicates that a particular child (left or right) is absent.

---

## Output Format

- A single line containing the **inorder traversal** of the binary tree.
- Nodes should be printed space-separated.

---

## Constraints

- No explicit constraints.
- Valid input is assumed.
- Time Limit: **1 second**.

---

## Sample Input 0

```
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
```

## Sample Output 0

```
4 2 5 1 6 3 7
```

---

## Approach

1. **Construct the binary tree level-wise**:
   - Use a **queue**.
   - Start by creating the root node from the first element.
   - Insert left and right children sequentially.
   - Skip insertion if the value is `-1`.

2. **Perform Inorder Traversal**:
   - Traverse the tree using the **inorder** technique:
     - **Left Subtree → Root → Right Subtree**

---

## Visual Representation

For the sample input:

```
Input: 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
```

The binary tree looks like:

```
        1
      /   \
     2     3
    / \   / \
   4   5 6   7
```

📌 **Inorder traversal** (left-root-right):
- Visit 4 → Visit 2 → Visit 5 → Visit 1 → Visit 6 → Visit 3 → Visit 7

Hence, Output:
```
4 2 5 1 6 3 7
```

---

## Full Java Code

```java
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class Solution {

    public static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String arr[] = sc.nextLine().split(" ");
        Queue<Node> q = new LinkedList<>();
        
        Node root = new Node(Integer.parseInt(arr[0]));
        q.add(root);
        
        int i = 1;
        
        while (!q.isEmpty()) {
            Node cur = q.poll();
            
            if (Integer.parseInt(arr[i]) != -1) {
                Node temp = new Node(Integer.parseInt(arr[i]));
                cur.left = temp;
                q.add(temp);
            }
            i++;
            
            if (Integer.parseInt(arr[i]) != -1) {
                Node temp = new Node(Integer.parseInt(arr[i]));
                cur.right = temp;
                q.add(temp);
            }
            i++;
        }
        
        inorder(root);
    }
}
```

---

## Key Points

- **Queue** is used for level-wise input building.
- **Recursion** is used for inorder traversal.
- Handles missing nodes with `-1` check.

---

## Notes

✅ Efficient for inputs with up to 10⁵ nodes.  
✅ Easy to extend to other types of traversals (preorder, postorder).

---
