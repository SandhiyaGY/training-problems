# Reverse the Linked List 1

## Problem Description

Write a Java program to:
- **Reverse a singly linked list** by changing the links between nodes.
- **Print** the reversed list.

You can implement the reversal using **both iterative and recursive** methods.  
(Current code uses an iterative method by inserting new nodes at the head.)

---

## Input Format

- A single line of integers separated by spaces, representing elements of the linked list.

## Output Format

- A single line displaying the elements of the linked list after reversing.

---

## Constraints

- Number of nodes: [0, 5000]
- Each node value: `-5000 <= Node.val <= 5000`

---

## Sample Input 0
```
1 2 3 4 5
```

## Sample Output 0
```
5 4 3 2 1
```

---

## Approach

### LinkedList Class
- `insert(int data)`:  
  - Creates a new node.
  - Inserts the node at the **head** of the list.
  - This insertion order automatically **reverses** the list compared to the input sequence.

- `print()`:  
  - Traverses from the head and prints each node's data.

### Main Steps
- Read input integers using `Scanner`.
- Insert elements into the linked list (in reverse order).
- Print the linked list.

---

## Full Java Code

```java
import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (sc.hasNextInt()) {
            list.insert(sc.nextInt());
        }

        list.print();
        sc.close();
    }
}
```

---

## Alternate Approach: Explicit Reversal (After Building the List)

If you first build the list normally and then **reverse it** explicitly, here is an **iterative** reversal:

```java
public Node reverseList(Node head) {
    Node prev = null;
    Node current = head;
    while (current != null) {
        Node nextTemp = current.next;
        current.next = prev;
        prev = current;
        current = nextTemp;
    }
    return prev;
}
```

Or a **recursive** reversal:

```java
public Node reverseListRecursive(Node head) {
    if (head == null || head.next == null) {
        return head;
    }
    Node p = reverseListRecursive(head.next);
    head.next.next = head;
    head.next = null;
    return p;
}
```

---

## Key Points
- **Current insertion** approach instantly builds the list in reverse.
- **Alternate** methods (iterative/recursive) show how to reverse a built linked list separately.
- Space Complexity: **O(1)** (no extra structures except pointers)
- Time Complexity: **O(N)** (single traversal)

---
