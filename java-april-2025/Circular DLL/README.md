# Circular Doubly Linked List - Java Implementation

## 📋 Description
This Java program implements a **Circular Doubly Linked List** with two main operations:
- **Insertion (`ins`)**: Adds a new node to the list.
- **Searching (`find`)**: Searches for a key in the list.

The list is **circular**, meaning the `next` pointer of the last node points to the head, and the `prev` pointer of the head points to the last node.

---

## 🚀 How it Works
- **Node Class**:  
  Represents an individual node containing:
  - `data`: Value stored.
  - `prev`: Pointer to previous node.
  - `next`: Pointer to next node.

- **DoublyLL Class**:
  - `head`: Reference to the first node.
  - `temp`: Keeps track of the last node for easy insertion.
  
- **Insertion Logic**:
  - If list is empty, create a node that points to itself.
  - Else, insert new node at the end and maintain circular links.

- **Find Logic**:
  - Checks if a key is present in the list.
  - Traverses from `head` using `next` until it returns to `head`.

---

## 🛠️ Code Overview

```java
import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

class DoublyLL {
    Node head, temp;
    
    public DoublyLL() {
        this.head = null;
    }
    
    public void ins(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.prev = newNode;
            head.next = newNode;
            temp = newNode;
        } else {
            temp.next = newNode;
            newNode.prev = temp;
            head.prev = newNode;
            newNode.next = head;
            temp = newNode;
        }
    }
    
    public boolean find(int key) {
        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        Node t = head.next;
        while (t != head) {
            if (t.data == key) {
                return true;
            }
            t = t.next;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLL dll = new DoublyLL();
        while (sc.hasNext()) {
            int num = sc.nextInt();
            dll.ins(num);
        }
        System.out.println(dll.find(4)); // Example search
        System.out.println(dll.find(6)); // Example search
    }
}
```

---

## 📥 Input Format
- Accepts integers one after another.
- Ends when there is no more input (EOF).

Example Input:
```
1 2 3 4 5
```

## 📤 Output Format
- Prints `true` if the element is found, otherwise `false`.

Example Output:
```
true
false
```

---

## ⚙️ Notes
- The list is **circular**, hence the traversal stops when it loops back to `head`.
- You can uncomment the last part inside `Main` to search for multiple keys continuously:

```java
// while(sc.hasNext()){
//     int key = sc.nextInt();
//     System.out.println(dll.find(key));
// }
```

---
