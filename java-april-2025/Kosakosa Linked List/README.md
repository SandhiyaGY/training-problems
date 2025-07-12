# Kosakosa Linked List

## Problem Description

Write a Java program to:
- Create a **linked list** by **appending elements** from input **without duplicates**.
- **Print** the resultant linked list.
- **Print** the **mid element** of the linked list.

---

## Input Format

- A single line of integers separated by spaces, representing elements to add to the linked list.

## Output Format

- **First Line**: Elements of the linked list (after removing duplicates).
- **Second Line**: The mid element of the linked list.

---

## Sample Input 0
```
1 2 3 4
```

## Sample Output 0
```
1 2 3 4
3
```

---

## Sample Input 1
```
1 2 3 4 5
```

## Sample Output 1
```
1 2 3 4 5
3
```

---

## Approach

1. **Node Class**: Represents a single element with `data` and `next` pointer.
2. **LinkedList Class**:
   - `insert(int data)`: Adds element at the end.
   - `print()`: Prints elements.
   - `gethead()`: Returns the head node.
3. **Main Steps**:
   - Read input numbers using `Scanner`.
   - Insert numbers into the linked list.
   - Remove duplicates while traversing (using a `HashSet`).
   - Print the linked list.
   - Find and print the middle element using the **slow and fast pointer technique**.

---

## Full Java Code

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
    }

    public Node gethead() {
        return head;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        LinkedList list = new LinkedList();

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            list.insert(a);
        }

        Node current = list.gethead();
        Node prev = null;

        // Remove duplicates and print
        while (current != null) {
            if (set.contains(current.data)) {
                prev.next = current.next;
            } else {
                System.out.print(current.data + " ");
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        System.out.println();

        // Find mid element
        Node slow = list.gethead();
        Node fast = list.gethead();

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (slow != null) {
            System.out.println(slow.data);
        }

        sc.close();
    }
}
```

---

## Key Points
- **HashSet** is used to track and avoid duplicates.
- **Slow and Fast Pointer** is used to find the middle efficiently in O(N) time.
- **Space Complexity**: O(N) (for the HashSet)
- **Time Complexity**: O(N) (single pass to build + remove duplicates + find mid).

---
