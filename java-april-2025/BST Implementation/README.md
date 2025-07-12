# Binary Search Tree (BST) Implementation

## Problem Description

Implement a Binary Search Tree (BST) with the following operations:
1. **insert**: Insert an element into the BST at the correct position. If the element is equal to the current node, it should be inserted in the left subtree.
2. **delete**: Remove an element from the BST. If the element to be deleted has two children, replace it with the minimum element from the right subtree.
3. **search**: Search for a given element in the BST and return `true` if it exists, otherwise return `false`.
4. **printTree (recursive)**: Print the entire BST in a specific format:
    - For each node `N` with data `x`, print it in the format: `N:L:x,R:y`
    - Where `L:x` represents the left child of node `N`, and `R:y` represents the right child. If the node doesn't have a left or right child, skip it from the print statement.
    - The output should be printed recursively for all nodes.

---

## Input Format

- The first line contains the number of queries `t`.
- Each of the following lines represents a query with an operation:
  - **1 x**: Insert `x` into the BST.
  - **2 x**: Delete `x` from the BST.
  - **3 x**: Search for `x` in the BST.
  - **4**: Print the BST recursively.

---

## Output Format

- For `search` operation (query `3 x`), output `true` or `false` indicating whether the element exists in the BST.
- For `printTree` operation (query `4`), output the nodes of the BST in the specified format.

---

## Constraints

- \(1 \leq N \leq 10^5\) where \(N\) is the number of nodes in the BST.
- Time Limit: 1 second for each query.

---

## Sample Input 0

```
6
1 2
1 3
1 1
4
2 2
4
```

## Sample Output 0

```
2:L:1,R:3
1:
3:
3:L:1,
1:
```

---

## Sample Input 1

```
6
1 2
1 3
1 1
3 2
2 2
3 2
```

## Sample Output 1

```
true
false
```

---

## Approach (Based on the Given Code)

1. **Node Creation**:  
   A `Node` class represents each node of the tree with fields `data`, `left`, and `right`.

2. **Insert Operation**:  
   The `insert()` function inserts a new node into the BST. If the value is less than or equal to the current node, it goes to the left subtree; otherwise, it goes to the right subtree.

3. **Delete Operation**:  
   The `delete()` function removes a node. If the node has two children, the node is replaced by the minimum value node from the right subtree.

4. **Search Operation**:  
   The `search()` function checks whether a given element exists in the BST by recursively searching in the left or right subtrees based on the comparison.

5. **Print Tree (Recursive)**:  
   The `display()` function recursively prints the BST using the format `N:L:x,R:y`.

6. **Main Function**:  
   - The main function processes input queries and executes the corresponding operations on the BST.
   - For each query:
     - Insert, delete, search, or print the tree as required.

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
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<=root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    
    public static boolean search(Node root,int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        if(data<root.data){
            return search(root.left,data);
        }
        else{
            return search(root.right,data);
        }
    }
    
    public static Node delete(Node root,int data){
        if(root==null){
            return null;
        }
        if(data<root.data){
            root.left=delete(root.left,data);
            return root;
        }
        else if(data>root.data){
            root.right=delete(root.right,data);
            return root;
        }
        else
        {
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null && root.right!=null){
                return root.right;
            }
            else if(root.left!=null && root.right==null){
                return root.left;
            }
            else
            {
                Node temp=root.right;
                while(temp.left!=null)
                {
                    temp=temp.left;
                }
                root.data=temp.data;
                root.right=delete(root.right,temp.data);
                return root;
            }
        }
    }

    public static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null)
            System.out.print("L:"+root.left.data+",");
        if(root.right!=null)
            System.out.print("R:"+root.right.data);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Node root=null;
        while(t-->0){
            int choice=sc.nextInt();
            if(choice==1){
                int num=sc.nextInt();
                root=insert(root,num);
            }else if(choice==2){
                int num=sc.nextInt();
                root=delete(root,num);
            }else if(choice==3){
                int num=sc.nextInt();
                System.out.println(search(root,num));
            }else if(choice==4){
                display(root);
            }
        }
    }
}
```

---

## Notes

- The BST operations ensure that the tree remains balanced (for the most part) with efficient search, insertion, and deletion.
- The `insert` operation handles equal elements by placing them in the left subtree, ensuring no duplicate elements will be added on the right side.
- The recursive `display()` function prints the BST in the required format.

---
