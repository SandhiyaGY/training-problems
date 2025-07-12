# Level Order Traversal of a Binary Tree - Java Implementation

## 📋 Description
This Java method implements **Level Order Traversal** (also called **Breadth-First Search**) for a Binary Tree using a **Queue**.

In Level Order Traversal:
- We visit the nodes level by level from top to bottom.
- Within each level, nodes are visited from left to right.

---

## 🚀 How it Works
- **Step 1**: Initialize an empty `Queue`.
- **Step 2**: Enqueue the `root` node.
- **Step 3**: While the queue is not empty:
  - Dequeue the front node and print its `data`.
  - If the dequeued node has a `left` child, enqueue it.
  - If the dequeued node has a `right` child, enqueue it.

---

## 🛠️ Code Overview

```java
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    public static void level(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
    
    public static void main(String[] args) {
        // Sample Tree:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        level(root);
        // Output: 1 2 3 4 5 6
    }
}
```

---

## 📥 Input Format
- A binary tree is provided with nodes containing integer data.

Example Tree Structure:
```
        1
       / \
      2   3
     / \   \
    4   5   6
```

## 📤 Output Format
- Prints the nodes in level order traversal (space-separated).

Example Output:
```
1 2 3 4 5 6
```

---

## ⚙️ Notes
- `Queue` helps manage the order of visiting nodes level-by-level.
- This approach has a time complexity of **O(N)**, where **N** is the number of nodes in the tree.
- It uses extra space proportional to the number of nodes at the deepest level.

---

