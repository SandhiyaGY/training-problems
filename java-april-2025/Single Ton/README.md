# Single Ton - Binary Tree Nodes Without Siblings

## Problem Description

Given a binary tree, your task is to print all nodes that do not have a sibling.  
A node is considered without a sibling if it is either the only child of its parent or if one of its child nodes is missing.

### Output Specifications
- The nodes without siblings should be printed in top-down fashion, starting with the right subtree, followed by the left subtree.
- The node data should be separated by a single space.

---

## Input Format

- The first and only line of input will consist of space-separated integers representing the node data in level order.
- `-1` is used to indicate a missing node, meaning that no child exists in that position.

---

## Output Format

- The output will be a single line containing the node data of all nodes without siblings, printed in the order specified (right subtree first, then left subtree).
- The node data should be separated by a space.

---

## Constraints

- \(1 \leq N \leq 10^5\) where \(N\) is the number of nodes in the binary tree.
- Time Limit: 1 second.

---

## Sample Input 0

```
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
```

## Sample Output 0

```
9
```

---

## Approach (Based on the Given Code)

1. **Node Creation**:  
   - A `Node` class is used to represent each node with fields: `data`, `left`, and `right`.
   
2. **Binary Tree Construction**:  
   - The tree is constructed level-by-level using a queue.
   - For each node, two values are read representing the left and right children.
   - If the value is not `-1`, a new `Node` is created and linked appropriately.

3. **Identifying Nodes Without Siblings**:  
   - A recursive function `print(root)` traverses the tree:
     - If a node has no left child but a right child, its right child is printed.
     - If a node has no right child but a left child, its left child is printed.
   - The function prioritizes printing the right child first, followed by the left child.

4. **Final Output**:  
   - The nodes without siblings are printed in the specified order.

---

## Visual Representation (for Sample Input)

```
        5
       / \
      6   10
     / \    \
    2   3    9
```

Here, `9` is the only node without a sibling.

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
    Node(int data){
        this.data=data;
    }
}

public class Solution {
    public static void print(Node root){
        if(root!=null){
            if(root.left==null&&root.right!=null){
                System.out.print(root.right.data+" ");
            }
            if(root.left!=null&&root.right==null){
                System.out.print(root.left.data+" ");
            }
            print(root.right);
            print(root.left);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Node> q=new LinkedList<>();
        int num=sc.nextInt();
        Node root=new Node(num);
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            num=sc.nextInt();
            if(num!=-1){
                Node newNode=new Node(num);
                temp.left=newNode;
                q.add(newNode);
            }
            num=sc.nextInt();
            if(num!=-1){
                Node newNode=new Node(num);
                temp.right=newNode;
                q.add(newNode);
            }
        }
        print(root);
    }
}
```

---

## Notes

- Level-order input ensures that the tree is built in the correct shape.
- The recursive print function ensures that nodes without siblings are identified and printed efficiently.

---

