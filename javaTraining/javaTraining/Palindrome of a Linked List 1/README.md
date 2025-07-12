# Palindrome of a Linked List 1

## Problem Description

Write a Java program to:
- Check whether a **singly linked list** of integers is a **palindrome** or not.
- Print `'true'` if the list is a palindrome, otherwise print `'false'`.

A palindrome list reads the same **forwards** and **backwards**.

---

## Input Format

- A single line of integers separated by spaces.
- `-1` indicates the **end** of the linked list and should **not** be considered part of the list.

## Output Format

- Output a single line: `'true'` if the linked list is a palindrome, `'false'` otherwise.

---

## Constraints

- Number of nodes (M): `0 <= M <= 10^5`
- Node values: Any valid integers.
- Time Limit: `1 second`

---

## Sample Input 0
```
1 2 3 3 3 1 -1
```

## Sample Output 0
```
false
```

---

## Approach

### LinkedList Class
- `insert(int data)`:
  - Adds a new node at the **end** of the linked list.

- `find()`:
  - Traverse the linked list and store the elements in an `ArrayList`.
  - Use two-pointer technique:
    - `left` starts from the beginning.
    - `right` starts from the end.
  - Compare corresponding elements moving towards the center.
  - If any mismatch, return `false`.
  - If no mismatches, return `true`.

### Main Steps
- Read integers using `Scanner`.
- Insert elements into the linked list until `-1` is encountered.
- Call `find()` method to check palindrome and print the result.

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

    public LinkedList() {
        this.head = null;
    }

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

    public boolean find() {
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (sc.hasNextInt()) {
            int val = sc.nextInt();
            if (val != -1) {
                list.insert(val);
            } else {
                break;
            }
        }
        System.out.print(list.find());
        sc.close();
    }
}
```

---

## Key Points
- **Space Complexity**: O(N) (due to the extra list used to store node values).
- **Time Complexity**: O(N) (one traversal to store and another traversal to compare).
- **Important**: Input ends with `-1`, not part of the list.

---
