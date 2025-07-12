# Find Various Possible Paths

## Problem Description

There is a robot on an `m x n` grid.  
The robot starts at the **top-left corner** (i.e., `grid[0][0]`) and wants to reach the **bottom-right corner** (i.e., `grid[m-1][n-1]`).

- The robot **can only move** either:
  - **Downward** ("v" → vertical move)
  - **Rightward** ("h" → horizontal move)

You need to print **all possible paths** from the start to the end.

---

## Input Format

- **First Line**: Two integers separated by space:
  - The first integer `m` is the number of rows.
  - The second integer `n` is the number of columns.

---

## Output Format

- Print a list of strings representing all possible paths.
- Each move:
  - `"h"` represents a move to the right.
  - `"v"` represents a move downward.
- The output list must show all combinations.

---

## Constraints

- `1 <= m, n <= 10`
- Time Limit: **1 second**

---

## Sample Input 0
```
3 2
```

## Sample Output 0
```
[hvv, vhv, vvh]
```

---

## Sample Input 1
```
3 1
```

## Sample Output 1
```
[vv]
```

---

## Approach

- Use **recursion** to explore all paths:
  - Start with an empty string.
  - At each cell:
    - Move **right** by appending `'h'` and decreasing the column (`n-1`).
    - Move **down** by appending `'v'` and decreasing the row (`m-1`).
  - If both `m` and `n` are `1`, add the current path to the list (destination reached).
  - If either `m` or `n` becomes `0`, terminate that path (invalid move).

---

## Full Java Code

```java
import java.util.*;

public class Solution {

    public static void find(String s, int m, int n, List<String> list) {
        if (m == 1 && n == 1) {
            list.add(s);
            return;
        }
        if (m == 0 || n == 0) {
            return;
        }
        
        // Move right
        find(s + "h", m, n - 1, list);
        
        // Move down
        find(s + "v", m - 1, n, list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        List<String> list = new ArrayList<>();
        String s = "";
        
        find(s, m, n, list);
        
        System.out.print(list);
        sc.close();
    }
}
```

---

## Key Points

- **Time Complexity**: O(2^(m+n))  
  (Each move can branch into two possibilities until reaching the destination.)
- **Space Complexity**: O(m+n) for the recursion stack plus space for the output list.
- Works even if either `m = 1` or `n = 1` (single row or single column).

---

## Example Walkthrough (for 3x2 grid)

Paths:
1. **hvv**: move right → down → down
2. **vhv**: move down → right → down
3. **vvh**: move down → down → right

---

Would you also like a **diagram** showing the moves on a small 3x2 grid? 📈✨  
