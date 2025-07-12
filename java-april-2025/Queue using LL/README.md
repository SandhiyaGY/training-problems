# Queue Implementation using Linked List - Java

## 📋 Description
This Java program implements a **Queue** data structure using a **singly linked list**.

The operations supported are:
- **Enqueue**: Add an element to the rear of the queue.
- **Dequeue**: Remove an element from the front of the queue.
- **Display**: Print all elements from front to rear.

---

## 🚀 How it Works
- **Node Class**:
  - Contains `data` (integer value) and a `next` pointer to the next node.

- **QueueLL Class**:
  - `head`: Points to the front of the queue.
  - `last`: Points to the rear of the queue.

### Operations:
- **enqueue(int data)**:
  - Create a new node.
  - If the queue is empty, set both `head` and `last` to the new node.
  - Otherwise, link the new node after `last` and update `last`.

- **dequeue()**:
  - Remove the node pointed to by `head`.
  - Update `head` to the next node.
  - If the queue becomes empty, `last` remains unchanged (can be further optimized if needed).

- **display()**:
  - Traverse from `head` and print each node's `data`.

---

## 🛠️ Code Overview

```java
import java.util.Scanner;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

class QueueLL {
    Node head;
    Node last;
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }
    
    public void dequeue() {
        if (head == null) {
            return;
        }
        Node temp = head.next;
        head.next = null;
        head = temp;
    }
    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLL queue = new QueueLL();
        
        while (sc.hasNext()) {
            int choice = sc.nextInt();
            if (choice == 1) {
                int num = sc.nextInt();
                queue.enqueue(num);
            } else if (choice == 2) {
                queue.dequeue();
            } else {
                queue.display();
            }
        }
    }
}
```

---

## 📥 Input Format
- First integer: **choice** (`1` for enqueue, `2` for dequeue, any other number for display).
- If choice is `1`, the next integer is the element to be enqueued.

Example Input:
```
1 10
1 20
1 30
3
2
3
```

## 📤 Output Format
- Elements printed in a single line, separated by spaces, whenever display operation is triggered.

Example Output:
```
10 20 30 
20 30 
```

---

## ⚙️ Notes
- `dequeue()` does nothing if the queue is empty (no error is thrown).
- After a dequeue, memory of removed node is freed manually by setting `next = null`.
- `display()` does not print a newline after elements; modify if needed.

---

