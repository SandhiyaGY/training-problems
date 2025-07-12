# K Reverse Linked List 1

## Problem Description

Given a singly linked list of integers, **reverse the nodes** of the list **k at a time** and return the modified list.

- If the number of nodes is **not a multiple of k**, reverse the remaining nodes at the end as well.
- If `k = 0`, return the list as is.

---

## Input Format

- **First Line**: Space-separated integers representing the linked list elements.
- **Second Line**: An integer `k` indicating the group size to reverse.
- **Important**: `-1` indicates the **end** of input and should **not** be considered part of the list.

---

## Output Format

- Print the elements of the updated linked list after k-reversals, separated by spaces.

---

## Constraints

- `0 <= M <= 10^5` (where M is the number of nodes)
- `0 <= k <= M`
- Node values are integers.
- Time Limit: **1 second**

---

## Sample Input 0
```
1 2 3 4 5 -1
0
```

## Sample Output 0
```
1 2 3 4 5
```

---

## Sample Input 1
```
1 2 3 4 5 -1
2
```

## Sample Output 1
```
2 1 4 3 5
```

---

## Sample Input 2
```
1 2 3 4 5 -1
3
```

## Sample Output 2
```
3 2 1 5 4
```

---

## Approach

### `LinkedList` Class
- `insert(int data)`:
  - Insert a node at the end of the linked list.
  
- `reverse(int k, Node head)`:
  - Recursively reverse nodes in groups of size `k`.
  - Reverse the first `k` nodes, then recursively reverse the rest of the list.
  - Connect the current reversed block with the reversed next block.

- `print()`:
  - Print the linked list nodes separated by spaces.

### Special Cases
- If `k == 0`, the list remains unchanged.

---

## Full Java Code

```java
import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    Node temp;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            temp = newNode;
        } else {
            temp.next = newNode;
            temp = newNode;
        }
    }

    public Node reverse(int k, Node head) {
        if (head == null) return null;
        
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        // Reverse first k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Recursively reverse remaining nodes
        if (current != null) {
            head.next = reverse(k, current);
        }

        // prev is the new head of this block
        return prev;
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
        
        // Insert nodes
        while (sc.hasNext()) {
            int val = sc.nextInt();
            if (val != -1) {
                list.insert(val);
            } else {
                break;
            }
        }
        
        // Read k
        sc.nextLine();
        int k = sc.nextInt();

        // Reverse in groups if k != 0
        if (k != 0) {
            list.head = list.reverse(k, list.head);
        }

        list.print();
        sc.close();
    }
}
```

---

## Key Points
- **Time Complexity**: O(N), where N is the number of nodes.
- **Space Complexity**: O(N/k) due to recursion stack calls.
- Handles both normal and edge cases:
  - Empty list.
  - k = 0 (no reversal).
  - k > size of remaining nodes (reverse whatever is left).

---

## Possible Optimizations
- If recursion depth becomes an issue for very large inputs, an **iterative** k-group reversal method can be implemented.

---

